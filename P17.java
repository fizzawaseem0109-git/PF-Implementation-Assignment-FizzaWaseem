public class P17 {
    public static void main(String[] args) {

        System.out.println("---Separate Integral and Fractional Parts ---");
        
        double realNumber = 15.58971;

        // Integral part
        int integralPart = (int) realNumber;

        // Fractional part
        double fractionalPart = realNumber - integralPart;

        System.out.println("Original Number: " + realNumber);

        System.out.println("Integral Part: " + integralPart);
        System.out.println(String.format("Fractional Part: %.5f", fractionalPart));
    }
}
