package criticalthinkingwkone;

public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.00;

    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }
 
    
    @Override
    public void withdrawal(double amt) {
        double totWithdrawal = amt;
        if (amt > getBalance()) {
            totWithdrawal += OVERDRAFT_FEE;
        }
        super.withdrawal(totWithdrawal);
    }

    public void processWithdrawal(double amt) {
        double totWithdrawal = amt;
        if (amt > getBalance()) {
            totWithdrawal += OVERDRAFT_FEE;
            System.out.println("Withdrawal processed but received an overdraft fee of $" + OVERDRAFT_FEE);
        }
        super.withdrawal(totWithdrawal);
    }

    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}