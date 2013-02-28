
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
        if (d instanceof TRex)
            if ((Math.random()>0.5))
            {
                d.setAge(-1);
                attackerWins = true;
            }
            else
            {
                setAge(-1);
                attackerWins = false;
            }
        else
        {
            d.setAge(-1);
            attackerWins = true;
        }
        return attackerWins;
    }
}
