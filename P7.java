public class P7 {
 public static void main(String[] args) {

        System.out.println("--- Student Marks, Total, and Average ---");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
       
        System.out.print("Enter Roll No.: ");
        int rollNo = scanner.nextInt();

        System.out.print("Marks in Programming Fundamentals : ");
        int pfMarks = scanner.nextInt();

        System.out.print("Marks in Introduction to Computing : ");
        int icMarks = scanner.nextInt();

        System.out.print("Marks in Computer Graphics : ");
        int cgMarks = scanner.nextInt();

        int totalMarks = pfMarks + icMarks + cgMarks;
        double averageMarks = (double) totalMarks / 3.0;

        System.out.println("\n--- Student Report ---");
        System.out.println("Roll No.: " + rollNo);
        System.out.println("Total Marks: " + totalMarks + " / 300");
        // Using String.format for two decimal places
        System.out.println("Average Marks: " + String.format("%.2f", averageMarks));
        scanner.close();
    }

}
