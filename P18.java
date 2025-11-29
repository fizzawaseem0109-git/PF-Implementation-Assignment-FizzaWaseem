public class P18 {
    public static void main(String[] args) {

     System.out.println("---Equation Calculation ---");

        double vi = 10.0; 
        double t = 5.0;  
        double a = 9.8;  

        // s = vi * t + 0.5 * a * t^2
        double s = (vi * t) + (0.5 * a * t * t);

        System.out.println("Initial Velocity (vi): " + vi );
        System.out.println("Time (t): " + t );
        System.out.println("Acceleration (a): " + a );
        System.out.println(String.format("Distance (s): %.2f meters", s));
    }
}
