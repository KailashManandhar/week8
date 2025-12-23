package week8;


/**
 * Write a description of class tut8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    // instance method ( with no return and no parameters )
    public void display()
    {
        System.out.println("welcome to the calculator");
    }
    
    public int add( int i, int j) // formal parameters: parameters used to reperesent data to be inserted 
                                    // into a function.
                                    
    {
        return i + j;
    }
    
    public int getFixedNumber()
    {
        return 20;
    }
    
    
    // static method ( dont have to create object to call it in main function
    
    public static int square(int n)
    {
        return n*n;
    }
    
    // method overloading ( same name but different parameters; it just works)
    public double add(double i, double j)
    {
        return i + j;
    }
    
}