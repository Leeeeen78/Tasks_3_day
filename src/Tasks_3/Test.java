package Tasks_3;

public class Test {
    public static void main(String[] args) {
        BankAccount_1 account1 = new BankAccount_1(10000.10);
        BankAccount_1 account2 = new BankAccount_1(20000.0);

        account1.printBalance();
        account1.deposit(6000.90);
        account1.printBalance();
        account1.withdraw(100000.0);
        account1.printBalance();

        account2.deposit(30.0);
        account2.printBalance();
        account2.withdraw(10.0);
        account2.printBalance();
        account2.printBalance();
        System.out.println("***");
        account1.transferForm(account1, account2, 100);
        account1.printBalance();
        account2.printBalance();
    }

}
