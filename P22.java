public class P22 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
       
        System.out.println("---Student Data Input ---");
        
        scanner.nextLine(); 
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age (years): ");
        int age = scanner.nextInt();

        System.out.print("Enter Height (meters): ");
        double height = scanner.nextDouble();
        
        
        scanner.nextLine(); 
        System.out.print("Enter Gender (M/F): ");
        String gender = scanner.nextLine(); 

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println(String.format("Height: %.2f meters", height));
        System.out.println("Gender: " + gender);
        scanner.close();
    }
}
