public class P27 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("---Time to Seconds Converter ---");

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        
        int SECONDS_PER_HOUR = 3600;
        int SECONDS_PER_MINUTE = 60;

        // Calculate total seconds
        long totalSeconds = (long) hours * SECONDS_PER_HOUR + 
                            (long) minutes * SECONDS_PER_MINUTE + 
                            seconds;

        System.out.println("Time entered: " + hours + "h " + minutes + "m " + seconds + "s");

        System.out.println("Total seconds: " + totalSeconds);
        scanner.close();
    }

}
