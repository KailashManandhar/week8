package week8;


/**
 * Write a description of class elect here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class elect
{
    private String name;
    private int units;
    
    
    
    public elect(String nam, int u)
    {
        this.name = nam;
        this.units = u;
    }
    
    public void setUnits(int u)
    {
        this.units = u;
    }
    public int getUnits()
    {
        return this.units;
    }
    
    public double bill()
    {
        if (units <= 100)
        {
            return units * 5;
        }
        
        return ((units - 100) * 8) + (100 * 5);
    }
}
