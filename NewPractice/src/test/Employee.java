package test;
class Account{
    public long account_no;
    public long balance;
    public void deposit(long amount){
        balance=balance+amount;
    }
    public void withdraw(long amount){
        balance=balance-amount;
    }
}

public class Employee extends Account {
    public String name;
    public int id;
    public long salary(long basic_sal,long allowances,long IT){
        super.balance=basic_sal+allowances-IT;
        return super.balance;
    }
}
