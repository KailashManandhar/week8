package week8;


/**
 * Write a description of class hospital here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hospital
{
    private String name;
    private int age, days;
    private double charge;
    
    public hospital(String n, int a, int d, double c)
    {
        this.name = n;
        this.age = a;
        this.days = d;
        this.charge = c;
    }
    
    public void setDays(int days)
    {
        this.days = days;
    }
    public int getDays()
    {
        return days;
    }
    
    public double bill()
    {
        if (days > 7)
        {
            return (days * charge) * 0.9;
        }
        return days*charge;
    }
    public void display()
    {
        System.out.println(name + "  " + age + "  " + days + "  " + bill());
        
    }
}