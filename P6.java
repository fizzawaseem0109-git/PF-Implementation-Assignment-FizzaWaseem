public class P6 {
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("--- Age in Months ---");

        System.out.print("Enter age in years: ");
        int ageYears = scanner.nextInt();

        int ageMonths =  ageYears * 12;

        System.out.println("Age in months: " + ageMonths);
        
        scanner.close();
    }


}
