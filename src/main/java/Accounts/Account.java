package Accounts;

public interface Account {
    boolean add(long amount) throws Exception;
    boolean pay(long amount) throws Exception;
    boolean transfer(Account account, long amount) throws Exception;
    long getBalance();
}
