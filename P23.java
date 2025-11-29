public class P23 {
    public static void main(String[] args) {

        System.out.println("---Circle Area and Circumference ---");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Area = πr^2
        double area = Math.PI * radius * radius;
        // Circumference = 2πr
        double circumference = 2 * Math.PI * radius;

        System.out.println(String.format("Area of the circle:\n %.3f", area));

        System.out.println(String.format("Circumference of the circle:\n %.3f", circumference));
        scanner.close();
    }

    
}
