import Accounts.CreditAccount;
import Accounts.SimpleAccount;

public class main {
    public static void main() throws Exception {
        SimpleAccount SA = new SimpleAccount();
        CreditAccount CA = new CreditAccount(10000);
        if (!SA.pay(9999)) System.err.println("Not enough money on account!");
        else
            System.out.println("Payment from SA successed");

        if (!SA.add(1000)) System.err.println("Adding failed!");
        if (!SA.add(1000)) System.err.println("Adding failed!");

        if (!SA.pay(9999)) System.err.println("Not enough money on account!");
        else
            System.out.println("Payment from SA successed");

        if (!CA.add(1000)) System.err.println("Adding failed!");

        if (!CA.transfer(SA, 9999)) System.err.println("Transfer failed!");
        System.out.println("SA BALANCE: " + SA.getBalance());
        System.out.println("CA BALANCE: " + CA.getBalance());

        if (!SA.pay(9999)) System.err.println("Not enough money on account!");
        else
            System.out.println("Payment from SA successed");

        System.out.println("SA BALANCE: " + SA.getBalance());
        System.out.println("CA BALANCE: " + CA.getBalance());

        if (!SA.add(1000)) System.err.println("Adding failed!");
        if (!SA.add(1000)) System.err.println("Adding failed!");
        if (!CA.add(1000))System.err.println("Adding failed!");
        if (!CA.add(5000))System.err.println("Adding failed!");
        System.out.println("SA BALANCE: " + SA.getBalance());
        System.out.println("CA BALANCE: " + CA.getBalance());
        //if (!CA.add(-1))System.err.println("Adding failed!"); // My Exception for amount < 0
    }
}
