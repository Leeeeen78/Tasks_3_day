package Tasks_3;

public class BankAccount {
    double balance;

    BankAccount(){
    };
    public BankAccount (double balance){
        this.balance = balance;
    }
    double deposit(double amount){
        balance +=amount;
        return balance;
    }
    double withdraw(double amount){
        balance -=amount;
        return balance;
    }
    void printBalance(){
        System.out.println("Current balance :" + balance);
    }
    public double transferFrom(double amount) {
        if (balance - amount < 0) {
            System.out.println("Transfer canceled. There is not enough funds.");
        } else {
            balance -= amount;
        }
        return balance;
    }

}


