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
        System.out.println("square of 8 is : " + calculator.square(8)); // class name for this one
        
        Student s1 = new Student(1,"kailash","kuleshwor",98473469);
        s1.display();
        
        Employee e = new Employee(10000);
        System.out.println("the gross salary is : " + e.calculateGrossSalary());
        
        
        backaccount b = new backaccount(1,20000, "kailash");
        
        b.deposit(1000);
        System.out.println(b.withdraw(20000));
        System.out.println(b.getBalance());
        
        shoppingcart s = new shoppingcart("lolipop", 1000, 20);
        s.cart();
        
        elect es = new elect("kailash", 200);
        System.out.println(es.bill());
        
        
        hospital h = new hospital("kailash", 10, 20,200);
        hospital h1 = new hospital("ram", 20, 30, 200);
        
        h.display();
        h1.display();
    }
}