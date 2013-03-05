
/**
 * Write a description of class DinoDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DinoDriver
{
    public static void main()
    {
        Dinosaur[] dinoPop = new Dinosaur[50];
        for (int i = 0; i<dinoPop.length; i+=2)
        {
           dinoPop[i] = new TRex((int)(Math.random()*40));
           dinoPop[i+1] = new Velo((int)(Math.random()*40));
        }
        
        for (int i = 0; i<dinoPop.length; i++)
        {
            if(dinoPop[i].getAge()!= -1)
            {
                int other;
                do
                {
                    other = (int)(Math.random()*40);
                }while(other == i);
                if(dinoPop[other].getAge() !=-1)
                    dinoPop[i].attack(dinoPop[other]);
                else 
                    System.out.println("Opp dead");
            }
            else 
                System.out.println("this dead");
        }
        
        int popTotal = 0;
        for (int i = 0; i<dinoPop.length; i++)
        {
            if (dinoPop[i].getAge() != -1)
                popTotal++;
        }
        Velo v = new Velo(8);
        Velo v1 = new Velo(9);
        v.compareTo(v1);
        System.out.println("Total number of living dinos: "+popTotal);
        
        
    }
}
