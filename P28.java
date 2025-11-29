public class P28 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("--- Calculate Discriminant ---");

        System.out.print("Enter value for 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for 'b': ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for 'c': ");
        double c = scanner.nextDouble();

        // disc = b^2 - 4ac
        double disc = (b * b) - (4 * a * c);

        System.out.println(String.format("Discriminant (disc = b^2 - 4ac) is: %.2f", disc));
        scanner.close();
    }

}
