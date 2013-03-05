
/**
 * Write a description of class TRex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{
    public TRex()
    {
        setType("TRex");
        setAge(0);
        setGender(Math.random()<.5);
    }
    
    public TRex(int a)
    {
        setType("TRex");
        setAge(a);
        setGender(Math.random()<.5);
    }
    
    

    public boolean attack(Dinosaur d)
    {
        boolean attackerWins;
        double chance = Math.random();
        if (d instanceof TRex)
            if (chance<0.4)
            {
                d.setAge(-1);
                attackerWins = true;
                System.out.println("TRex defeats "+d.getType());
            }
            else if (chance<0.8)
            {
                setAge(-1);
                attackerWins = false;
                System.out.println(d.getType()+" defeats TRex.");
            }
            else
                attackerWins = false;
        else
        {
            d.setAge(-1);
            attackerWins = true;
        }
        return attackerWins;
    }
}
