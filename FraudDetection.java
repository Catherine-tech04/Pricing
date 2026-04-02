public class FraudDetection {

    public static boolean isFraud(int amount) {
        return amount > 10000; // simple rule
    }

    public static void main(String[] args) {
        System.out.println("Fraud Detection System Running");
    }
}