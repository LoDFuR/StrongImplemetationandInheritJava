package Accounts;

public class SimpleAccount implements Account{
    private long value = 0;

    @Override
    public boolean add(long amount) throws Exception{
        if (amount <= 0){
            throw new Exception("Amount  must be more than 0!");
        }
        long val = this.getBalance();
        this.setValue(val + amount);
        if ((val + amount) != this.getBalance())
            return false;
        else
            return true;
    }

    @Override
    public boolean pay(long amount) throws Exception{
        if (amount <= 0)
            throw new Exception("Payments must be more than 0!!!!");
        if (this.getBalance() < amount) {
            return false;
        }
        else {
         this.setValue(this.getBalance() - amount);
         return true;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) throws Exception {
        if (amount > this.getBalance())
        return false;
        else {
            try {
            if (!account.add(amount)) return false;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            this.setValue(this.getBalance() - amount);
            return true;
            }
    }

    @Override
    public long getBalance() {
        return value;
    }


    private void setValue(long value) {
        this.value = value;
    }
    public SimpleAccount(){
        this.setValue(0);
    }
}
