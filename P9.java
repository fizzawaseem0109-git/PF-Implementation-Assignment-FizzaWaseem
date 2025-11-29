public class P9 {
    public static void main(String[] args) {

        System.out.println("--- Find Maximum of Four Numbers ---");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();

        System.out.print("Enter fourth number: ");
        int n4 = scanner.nextInt();

        // Use Math.max() for finding maximum
        int max12 = Math.max(n1, n2);
        int max34 = Math.max(n3, n4);
        int maximum = Math.max(max12, max34);
        
        System.out.println("The maximum number among " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " is: " + maximum);

        scanner.close();
    }

}
 