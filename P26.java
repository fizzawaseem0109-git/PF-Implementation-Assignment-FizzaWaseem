public class P26 {
     public static void main(String[] args) {
        
        System.out.println("---Rupees to Dollars Converter ---");

        double RUPEES_AMOUNT = 12000.0;
        double EXCHANGE_RATE = 60.0; // Rs. 60 per dollar

        double dollars = RUPEES_AMOUNT / EXCHANGE_RATE;

        System.out.println("Rupees amount: Rs. " + RUPEES_AMOUNT);

        System.out.println("Exchange Rate: 1 Dollar = Rs. " + EXCHANGE_RATE);

        System.out.println(String.format(" Total Dollars: $%.2f", dollars));
    }

}
    

