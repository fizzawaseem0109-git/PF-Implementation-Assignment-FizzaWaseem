public class P25 {
    public static void main(String[] args) {
        System.out.println("--- Triangle Area ---");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        //Calculate  's'
        double s = (a + b + c) / 2.0;

        // Check  values for valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            
            // Area = sqrt(s * (s - a) * (s - b) * (s - c))
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println(String.format("Semi-perimeter (s): %.2f", s));

            System.out.println(String.format("Area of the triangle: %.2f", area));
        } 
        else {
            System.out.println("Error: The entered side lengths do not form a valid triangle.");
        }
        scanner.close();
    }


}
