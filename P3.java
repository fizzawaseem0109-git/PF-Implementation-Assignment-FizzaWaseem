public class P3 {
    public static void main(String[] args) {

        System.out.println("---Interchange Values---");

        int num1, num2;

        num1 = 50;
        num2 = 75;

        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);

        // Interchange values (without temporary variable)
        num1 = num1 + num2; 
        num2 = num1 - num2; 
        num1 = num1 - num2; 

        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
    
    }
}
