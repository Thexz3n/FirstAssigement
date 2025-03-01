
public class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        if (balance > 0) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }


    public void setDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void setDebit(double amount) {
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }
}