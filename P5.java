public class P5 {
     public static void main(String[] args) {

      java.util.Scanner sc = new java.util.Scanner(System.in);

      System.out.println("--- Sum and Product of Two Numbers ---");

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        sc.close();

    }


}
