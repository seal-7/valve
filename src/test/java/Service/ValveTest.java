package Service;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;


public class ValveTest {

//    @Test
//    public void checkAccuracyFor10PercentOf100Identifiers() {
//        int maxError = 0;
//        int minError = 100;
//        Map<Integer, Integer> dist = new HashMap<>();
//        for (int j =0; j < 1000000; j++) {
//            int count = 0;
//            for (int i = 0; i < 100; i++) {
//                String identifier = UUID.randomUUID().toString();
//                count = valve.control(identifier, 50) == true ? count + 1 : count;
//            }
//            int cnt = dist.get(count) == null ? 0 : dist.get(count);
//            dist.put(count, cnt + 1);
//            maxError = Math.max(count, maxError);
//            minError = Math.min(count, minError);
//        }
//        System.out.println(maxError + " | " + minError);
//        dist.forEach((key, value) -> System.out.println(key + " : " + value));
//    }

    @Test
    public void checkAccuracyFor50PercentOf100Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 50;
        int datasetSize = 100;
        for (int i = 0; i < 100; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 10);
    }

    @Test
    public void checkAccuracyFor100PercentOf100Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 100;
        int datasetSize = 100;
        for (int i = 0; i < 100; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 0.0);
    }

    @Test
    public void checkAccuracyFor1PercentOf1000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 1;
        int datasetSize = 1000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 5.0);
    }

    @Test
    public void checkAccuracyFor10PercentOf1000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 10;
        int datasetSize = 1000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 5.0);
    }

    @Test
    public void checkAccuracyFor25PercentOf1000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 25;
        int datasetSize = 1000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 5.0);
    }

    @Test
    public void checkAccuracyFor50PercentOf1000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 50;
        int datasetSize = 1000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 5.0);
    }

    @Test
    public void checkAccuracyFor75PercentOf1000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 75;
        int datasetSize = 1000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 5.0);
    }

    @Test
    public void checkAccuracyFor100PercentOf1000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 100;
        int datasetSize = 1000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 0.0);
    }

    @Test
    public void checkAccuracyFor1PercentOf10000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 1;
        int datasetSize = 10000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 2.0);
    }

    @Test
    public void checkAccuracyFor10PercentOf10000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 10;
        int datasetSize = 10000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 2.0);
    }

    @Test
    public void checkAccuracyFor25PercentOf10000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 25;
        int datasetSize = 10000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 2.0);
    }

    @Test
    public void checkAccuracyFor50PercentOf10000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 50;
        int datasetSize = 10000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 2.0);
    }

    @Test
    public void checkAccuracyFor75PercentOf10000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 75;
        int datasetSize = 10000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 2.0);
    }

    @Test
    public void checkAccuracyFor100PercentOf10000Identifiers() {
        int sampledCount = 0;
        int percentEnabled = 100;
        int datasetSize = 10000;
        for (int i = 0; i < datasetSize; i++) {
            String identifier = UUID.randomUUID().toString();
            sampledCount = Valve.control(identifier, percentEnabled) ? sampledCount + 1 : sampledCount;
        }
        double sampledPercent = ((double)sampledCount/datasetSize) * 100.0;
        Assert.assertEquals(percentEnabled, sampledPercent, 0.0);
    }
}