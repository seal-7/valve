package Service;

import static Constant.ValveConstants.ALGORITHM_SHA_256;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Valve {

    public static boolean control(final String identifier, final int percentEnabled) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance(ALGORITHM_SHA_256);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] hash = digest.digest(identifier.getBytes(StandardCharsets.UTF_8));
        String hexedString = convertBytesToHexedString(hash);
        Integer decimal = Integer.valueOf(Integer.toString(Integer.parseInt(hexedString.substring(Math.max(hexedString.length() - 3, 0)), 16), 10));
        return (decimal % 100) < percentEnabled;
    }

    private static String convertBytesToHexedString(byte[] hashedBytes) {
        StringBuilder hexedString = new StringBuilder();
        for (byte hashedByte : hashedBytes) {
            hexedString.append(Integer.toHexString(0xFF & hashedByte));
        }
        return hexedString.toString();
    }
}
