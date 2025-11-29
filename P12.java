public class P12 {
        public static void main(String[] args) {

        System.out.println("---Volume of a Cylinder using 'final' ---");

        double PI = Math.PI; // Using Math.PI for precision
        
        double radius = 5.0; 
        double height = 10.0; 
        
        // Volume = PI * r^2 * h
        double volume = PI * radius * radius * height;

        System.out.println("Radius (r): " + radius);
        System.out.println("Height (h): " + height);
        System.out.println(String.format("Volume of the cylinder: %.2f", volume));
    }

}
