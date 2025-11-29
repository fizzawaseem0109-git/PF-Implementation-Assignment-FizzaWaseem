public class P30 {
    public static void main(String[] args) {

        System.out.println("---Odd or Even Check ---");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            
            System.out.println(number + " is an EVEN number.");
        } 
        else {
            
            System.out.println(number + " is an ODD number.");
        }
        scanner.close();
    }

}
