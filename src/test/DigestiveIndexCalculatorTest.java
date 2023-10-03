package test;

import main.DigestiveIndexCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigestiveIndexCalculatorTest {

    @Test
    public void testLowDigestiveIndex() {
        double weight = 50.0;
        double height = 1.75;
        String result = DigestiveIndexCalculator.calculateDigestiveIndex(weight, height);
        assertEquals("Chỉ số tiêu hóa thấp", result);
    }

    @Test
    public void testNormalDigestiveIndex() {
        double weight = 70.0;
        double height = 1.75;
        String result = DigestiveIndexCalculator.calculateDigestiveIndex(weight, height);
        assertEquals("Chỉ số tiêu hóa bình thường", result);
    }

    @Test
    public void testHighDigestiveIndex() {
        double weight = 90.0;
        double height = 1.75;
        String result = DigestiveIndexCalculator.calculateDigestiveIndex(weight, height);
        assertEquals("Chỉ số tiêu hóa cao", result);
    }
}
