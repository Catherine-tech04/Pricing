public class App {

    // ================================
    // 1. SHOPPING CART / PRICING SYSTEM
    // ================================
    public static double calculatePrice(double price, boolean applyTax) {
        if (applyTax) {
            return price + (price * 0.18);
        } else {
            return price - (price * 0.10);
        }
    }

    // ================================
    // MAIN METHOD (JUST PICK ONE)
    // ================================
    public static void main(String[] args) {

        // Uncomment ONLY ONE based on question

         System.out.println("Final Price: " + calculatePrice(100, true));
        // System.out.println("Approved Amount: " + checkEligibility(50000, true));
        // System.out.println("Fraud Status: " + detectFraud(1000, false));
        // System.out.println("Stock: " + updateStock(50, true));
        // System.out.println("Marks: " + calculateMarks(80, true));
        // System.out.println("Balance: " + processPayment(200, true));

    }
}