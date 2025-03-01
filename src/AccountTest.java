
public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account(1, 500);
        Account account2 = new Account(2, 1000);


        System.out.println("Account ID: " + account1.getId() + ", Balance: " + account1.getBalance());
        System.out.println("Account ID: " + account2.getId() + ", Balance: " + account2.getBalance());


        account1.setDeposit(50);
        System.out.println("After Deposit, Account 1 balance is: " + account1.getBalance());


        account2.setDebit(100);
        System.out.println("After Debit, Account 2 balance is: " + account2.getBalance());

    }
}