package practice.bankAccount.model;

public class BankAccount {
    private long id;     //уникальный номер счета
    private String owner;
    private String bank;
    private int branch;  //номер филиала
    private double balance;

//конструктор на все поля

    public BankAccount(long id, String owner, String bank, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
    }

//конструктор без поля баланс

    public BankAccount(long id, String owner, String bank, int branch) {
        this.id = id;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        balance=0;
    }

//конструктор без поля владелец

    public BankAccount(long id, String bank, int branch, double balance) {
        this.id = id;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
        owner="Anonimus";
    }
//еще неполный конструктор

    public BankAccount(long id, String bank, int branch) {
        this.id = id;
        this.bank = bank;
        this.branch = branch;
        owner="Anonimus";
        balance=0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.println("ID "+id+"; Owner "+owner+"; Bank "+bank+"; Branch "+branch+"; Balance "+balance);
    }

    public boolean deposit(double sum){
        balance=balance+sum;
        return true;
    }

    public boolean withdraw(double sum){
        if (sum<=balance) {
            balance = balance - sum;
            return true;
        }
        return false;
    }
}
