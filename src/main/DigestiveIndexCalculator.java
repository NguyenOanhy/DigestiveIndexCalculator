package main;
public class DigestiveIndexCalculator {

    public static String calculateDigestiveIndex(double weight, double height) {
        double digestiveIndex = 0.0;
        digestiveIndex = weight / (height * height);
        digestiveIndex = (double) Math.round(digestiveIndex * 10) / 10;

        if (digestiveIndex < 18.5) {
            return "Chỉ số tiêu hóa thấp";
        } else if (digestiveIndex < 23) {
            return "Chỉ số tiêu hóa bình thường";
        } else {
            return "Chỉ số tiêu hóa cao";
        }
    }

    public static void main(String[] args) {
    }
}

