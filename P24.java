public class P24 {
     public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("---Total and Average Marks for Five Subjects ---");

        System.out.print("Enter marks for Subject 1 : ");
        int m1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2 : ");
        int m2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3 : ");
        int m3 = scanner.nextInt();

        System.out.print("Enter marks for Subject 4 : ");
        int m4 = scanner.nextInt();

        System.out.print("Enter marks for Subject 5 : ");
        int m5 = scanner.nextInt();

        int totalMarks = m1 + m2 + m3 + m4 + m5;
        double averageMarks = (double) totalMarks / 5.0;

        System.out.println("Total Marks: " + totalMarks +"/ 500" );

        System.out.println(String.format("Average Marks: %.2f", averageMarks));
        scanner.close();
    }

}
