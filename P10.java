public class P10 {
    public static void main(String[] args) {

       System.out.println("--- Miles to Kilometers Converter ---");
        
        double MILES = 2.5;
        double KM_PER_MILE = 1.609;

        double kilometers = MILES * KM_PER_MILE;

        System.out.println("Given kiolmeters: " + kilometers);
        System.out.println(String.format("%.2f miles is equal to %.3f kilometers.", MILES, kilometers));
    }

}
