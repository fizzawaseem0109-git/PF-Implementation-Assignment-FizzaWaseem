public class P13 {
        public static void main(String[] args) {

       System.out.println("---Area of a Circle using 'final static' ---");
        final double PI= 3.14159; // Defined constant
        
        double radius = 7.0;
        
        // Area = PI * r^2
        double area = PI * radius * radius;

        System.out.println("Radius (r): " + radius);
        System.out.println(String.format("Area of the circle: %.2f", area));
    }

}
