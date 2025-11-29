public class P8 {
    public static void main(String[] args) {

        System.out.println("--- Fahrenheit to Celsius Converter ---");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit (F): ");
        double fahrenheit = scanner.nextDouble();

        // C = (F - 32) * 5/9. Note: 5.0/9.0 ensures floating-point division.
        double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);

        System.out.println(String.format("%.2f F is equal to %.2f C", fahrenheit, celsius));
        scanner.close();
    }

}
