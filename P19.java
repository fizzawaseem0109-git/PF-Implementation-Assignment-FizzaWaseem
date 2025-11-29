public class P19 {
    public static void main(String[] args) {

      System.out.println("--- Age in Months and Days ---");

        int ageYears = 28;
        
        // Simple calculation
        int ageMonths = ageYears * 12;
        long ageDays = (long) ageYears * 365;

        System.out.println("Age in Years: " + ageYears);
        System.out.println("Age in Months: " + ageMonths);
        System.out.println("Age in Days : " + ageDays);
    }
}
