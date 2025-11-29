public class P15 {
    public static void main(String[] args) {

      System.out.println("--- Interchange Values ( using Temporary Variable) ---");

        String varA = "Hello";
        String varB = "World";

        System.out.println("Before swap:\n varA = " + varA + "\n varB = " + varB);

        // Swap using a temporary variable
        String temp = varA;
        varA = varB;
        varB = temp;

        System.out.println("After swap:\n varA =" + varA + "\n varB = " + varB);
    }

}
