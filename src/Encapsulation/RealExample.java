package Encapsulation;

class BankAccount {
    //step 1: Private data (hidden from outside)
    private double balance;

    //step 2: Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "deposited.");
        } else {
            System.out.println("Invalid deposit amount! ");
        }
    }


    //step 3: public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "withdrawn.");
        } else {
            System.out.println("Invalid or insufficient balance! ");
        }
    }

    //step 4: Public method to check balance
    public double getBalance() {
        return balance;
    }
}
    public class RealExample {
        public static void main(String[] args) {
            BankAccount account = new BankAccount();
            account.deposit(1000);
            account.withdraw(300);
            System.out.println("current Balance: " + account.getBalance());
        }
    }
