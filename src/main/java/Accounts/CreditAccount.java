package Accounts;

public class CreditAccount implements Account{
    private long value = 0;
    private long limit = -10000;
    @Override
    public boolean add(long amount) throws Exception {
        if (amount <= 0){
            throw new Exception("Amount  must be more than 0!");
        }
        if (0 <= this.getBalance() + amount)
            return false;
        else {
            this.setValue(this.getBalance() + amount);
            return true;
        }
    }


    @Override
    public boolean pay(long amount)  throws Exception{
        if (amount <= 0)  throw new Exception("Payments must be more than 0!!!!");
        if (this.getBalance() - amount < this.getLimit())
        return false;
        else {
            this.setValue(this.getBalance() - amount);
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (this.getLimit() >= this.getBalance() - amount)
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
        return this.value;
    }

    private void setLimit(long limit) {
        this.limit = limit;
    }

    public long getLimit() {
        return limit;
    }

    public void setValue(long value) {
        this.value = value;
    }
    public CreditAccount(long limit) throws Exception{
        if (limit == 0) throw new Exception("Limit couldn't be 0");
        if (limit > 0)
        this.limit = (-1) * limit;
        else
            this.limit = limit;
        this.value = 0;
    }
}
