package week8;


/**
 * Write a description of class backaccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class backaccount
{
    private int accountNumber;
    private int balance;
    private String name;
    
    public backaccount(int acc, int bal, String nam)
    {
        this.accountNumber = acc;
        this.balance = bal;
        this.name = nam;
    }
    
    public void setAccountNumber(int acc)
    {
        this.accountNumber = acc;
    }
    public int getAccountNumber()
    {
        return this.accountNumber;
    }
    
    public void setBalance(int bal)
    {
        this.balance = bal;
    }
    public int getBalance()
    {
        return this.balance;
    }
    public void setName(String nam)
    {
        this.name = nam;
    }
    public String getName()
    {
        return this.name;
    }
    
    public double get_Balance()
    {
        return balance;
    }
    
    public void deposit(int n)
    {
        balance += n;
    }
    
    public boolean withdraw(double n)
    {
        if ( n > balance)
        {
            return false;
        }
        balance -= n;
        return true;
    }
    
}