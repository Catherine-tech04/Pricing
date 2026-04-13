public class App {

    public static void main(String[] args) {
        double result = checkEligibility(50000, true);
        System.out.println("Eligibility result: " + result);
    }

    public static double checkEligibility(double income, boolean eligible) {
        if (eligible) {
            return income;
        } else {
            return 0;
        }
    }
}