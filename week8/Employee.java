package week8;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;
    
    public Employee(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    
    public void setBasicSalary(double basicSalary)
    {
        this.basicSalary = basicSalary;
    }
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
    public double calculateGrossSalary()
    {
        return basicSalary + ( basicSalary * 1.2);
    }
}