package week8;


/**
 * Write a description of class shoppingcart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shoppingcart
{
    private String item;
    private int price, quantity;
    
    
    public shoppingcart(String item, int price, int quanitity)
    {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void setQuantity(int q)
    {
        this.quantity = q;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public int calculate_total()
    {
        return quantity * price;
    }
    
    public double calculateDiscountedTotal()
    {
        return calculate_total() * 0.8;
    }
    
    public void cart()
    {
        System.out.println(item + "  " + calculateDiscountedTotal() + "  " + price);
    }
}