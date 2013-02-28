
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
        for (int i = 0; i<dinoPop.length; i++)
        {
            dinoPop[i] = new TRex((int)(Math.random()*40));
            System.out.println(dinoPop[i]);
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
            }
        }
        
        int popTotal = 0;
        for (int i = 0; i<dinoPop.length; i++)
        {
            if (dinoPop[i].getAge() != -1)
                popTotal++;
        }
        
        System.out.println("Total number of living dinos: "+popTotal);
        
        
    }
}
