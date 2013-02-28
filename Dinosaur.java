
/**
 * Abstract class Dinosaur - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Dinosaur
{
    // instance variables - replace the example below with your own
    private String type;
    private boolean isFemale;
    private int age;

    public void setType(String t)
    {
        type = t;
    }
        
    public String getType()
    {
        return type;
    }
        
    public void setGender(boolean g)
    {
        isFemale = g;
    }
    
    public boolean getGender()
    {
        return isFemale;
    }
    public void setAge(int a)
    {
        age = a;
    }
    
    public int getAge()
    {
        return age;
    }

    public abstract boolean attack(Dinosaur d);
    
    public String toString()
    {
        String s = "male";
        if (isFemale)
            s = "female";
            
        return type+" "+s+" "+age;
    }

}
