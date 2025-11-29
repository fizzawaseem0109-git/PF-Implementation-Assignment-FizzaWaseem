public class P14 {
public static void main(String[] args) {

     System.out.println("--- Millimeters to Inches Converter ---");

        double MM_PER_INCH = 25.4;
        double millimeters = 100.0;

        double inches = millimeters / MM_PER_INCH;
        
        System.out.println("Given inches: " + inches);
        System.out.println(String.format("%.2f mm is equal to %.3f inches.", millimeters, inches));
    }
}
