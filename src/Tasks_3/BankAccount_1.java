package Tasks_3;
public class BankAccount_1 {
    private double balance;

    public BankAccount_1() {
    }

    public BankAccount_1(double balance) {

        this.balance = balance;
    }

    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("There is not enough funds.");
            return;
        } else {
            this.balance -= amount;
        }
    }

    public void printBalance() {

        System.out.println("Account this.balance: " + this.balance);
    }

    void transferForm(BankAccount_1 account1, BankAccount_1 account2, double amount) {
        if (account1.balance < amount) {
            System.out.println("Transfer canceled. Transfer cancelled. You are trying to transfer" + amount + " units, but only" + this.balance + "are available.");
        } else if (amount > 5000) {
            System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit:" + amount);
        } else {
            account1.withdraw(amount);
            account2.deposit(amount);
        }
    }
}
