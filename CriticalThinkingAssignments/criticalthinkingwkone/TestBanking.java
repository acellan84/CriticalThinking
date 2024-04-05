package criticalthinkingwkone;

public class TestBanking {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Amanda");
        checkingAccount.setLastName("Cellan");
        checkingAccount.setAccountID(1211);
        checkingAccount.setInterestRate(5.5);
        checkingAccount.deposit(2000);
        checkingAccount.processWithdrawal(2800);
        checkingAccount.displayAccount();
    }
}