package week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private int id;
    private String name, address;
    private long phoneNumber;
    private static String collegeName = "islington";
    
    public Student(int id, String name, String address,long phoneNumber)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public long getInt()
    {
        return this.phoneNumber;
    }
    
    
    public void display()
    {
        System.out.println(id + "  " + name + "  " + address + "  " + phoneNumber + "  " +collegeName);
    }
    
    
}