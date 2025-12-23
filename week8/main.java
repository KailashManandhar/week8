package week8;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        calculator calc = new calculator();
        // method calling/ invocation
        calc.display();
                                                            // actual parameters: the actual value
        System.out.println("sum of 10 and 20 is : " + calc.add(10 , 20));
        
        
        System.out.println("The fixed number is : " + calc.getFixedNumber());
        
    }
}