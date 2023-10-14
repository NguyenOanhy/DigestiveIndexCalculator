package test;

import main.DigestiveIndexCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigestiveIndexCalculatorTest {

    @Test
    public void testLowDigestiveIndex() {
        double weight = 38;
        double height = 1.57;
        String result = DigestiveIndexCalculator.calculateDigestiveIndex(weight, height);
        assertEquals("Chỉ số tiêu hóa thấp", result);
    }

    @Test
    public void testNormalDigestiveIndex() {
        double weight = 49;
        double height = 1.6;
        String result = DigestiveIndexCalculator.calculateDigestiveIndex(weight, height);
        assertEquals("Chỉ số tiêu hóa bình thường", result);
    }

    @Test
    public void testNormalDigestiveIndex2() {
        double weight = 60;
        double height = 1.7;
        String result = DigestiveIndexCalculator.calculateDigestiveIndex(weight, height);
        assertEquals("Chỉ số tiêu hóa bình thường", result);
    }

    @Test
    public void testHighDigestiveIndex() {
        double weight = 58;
        double height = 1.53;
        String result = DigestiveIndexCalculator.calculateDigestiveIndex(weight, height);
        assertEquals("Chỉ số tiêu hóa cao", result);
    }
}
