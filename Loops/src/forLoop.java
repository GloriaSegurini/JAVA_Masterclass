public class forLoop {
    public static void main(String[] args) {
        calculateInterestloop();
        calculateInterestloop_alternative();
        
        
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void calculateInterestloop() {
        for (double counter = 7.5; counter <= 10; counter+=0.25) {
            double interestAmount = calculateInterest(100.0, counter);
            System.out.println(" 100 eur at " + counter + "% interest = eur" + interestAmount);
        }
    }

    public static void calculateInterestloop_alternative() {
        for (double counter = 7.5; counter <= 10; counter+=0.25) {
            double interestAmount = calculateInterest(100.0, counter);
            if (interestAmount > 8.5) {
                break;
            }
        
            System.out.println(" 100 eur at " + counter + "% interest = eur" + interestAmount);
        }
    }
    

}
