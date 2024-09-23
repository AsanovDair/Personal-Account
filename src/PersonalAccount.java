public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private Amount[] transactions;
    private int trancsactionCount;


    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[100];
        this.trancsactionCount = 0;
    }


    public void DEPOSIT(double amount){
    }
    public void WITHDRAWAL(double amount){
    }
    private double getBalance;
    private int getAccountNumber;
    private String getAccountHolder;

}
