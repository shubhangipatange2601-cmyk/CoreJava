package ExceptionHandling;

public class BankAccount {
    static int balance= 5000;

    public static void withdraw(int amount) throws InsufficientBalanceExample{
        if(amount<balance){
            throw new InsufficientBalanceExample("Not enough balance to withdrawal!");
        }

        balance = amount;
        System.out.println("Withdrawl success. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        try{
            withdraw(8000);    //More than balance
        } catch (InsufficientBalanceExample e ){
            System.out.println(e.getMessage());
        }
    }
}
