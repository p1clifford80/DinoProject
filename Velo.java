
/**
 * Write a description of class Velociraptor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velo extends Dinosaur implements Comparable
{
    public Velo()
    {
        setType("Velociraptor");
        setAge(0);
        setGender(Math.random()<0.5);
    }
    
    public Velo(int a)
    {
        setType("Velociraptor");
        setAge(a);
        setGender(Math.random()<0.5);
    }
    
    public int compareTo(Object o)
    {
        Dinosaur d = (Dinosaur) o;
        int compResult = 0;
        double percent = Math.random();
        if(d instanceof TRex) //30% Win, 30% draw, 40% lose
            if (percent < 0.3)
                compResult = -1;
            else if(percent < 0.7)
                compResult = 1;
            else
                compResult = 0;
        else if (d instanceof Velo)
            if (percent < 0.4)
                compResult = -1;
            else if(percent < 0.8)
                compResult = 1;
            else
                compResult = 0;
            
        return compResult;
    }
    
    public boolean attack(Dinosaur d)
    {
            int attackResult = compareTo(d);
            if (attackResult < 0) // Win
            {
                System.out.println("Velo defeats "+d.getType());
                d.setAge(-1);
                return true;
            }
            else if (attackResult>0) // Lose
            {
                System.out.println(d.getType()+" defeats Velo.");
                setAge(-1);
                return false;
            }
            else // draw
            {   System.out.println("Draw.");
                return false;
            }
    }

}
