public class Account {
    private long id;
    private String currency;
    private String accountOwner;
    private float balance;

    public Account(long id, String currency, String accountOwner, float balance) {
        this.id = id;
        this.currency = currency;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void depositMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }

    public float transferMoney(int amount, Account receiverAccount) {
        balance = balance - amount;
        receiverAccount.depositMoney(amount);
        return balance - amount;
    }

    public int withdrawMoney(int amount) {
        return (int) (balance - amount);
    }
}

