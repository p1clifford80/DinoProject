
/**
 * Write a description of class DinoDriver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DinoDriver2
{
    public static void main()
    {
        final int startPop = 20;
        ArrayList<Dinosaur> herd = new ArrayList<Dinosaur>();
        for (int i = 0; i<startPop; i++)
        {
           herd.add(new TRex((int)(Math.random()*40)));
           herd.add(new Velo((int)(Math.random()*40)));
        }
        
        
        for(int i=0; i<herd.size(); i++)
        {
            Dinosaur d1 = herd.get(i);
            System.out.print(i+1+" ");
            if(d1.getAge()!= -1)
            {
                int other;
                do
                {
                    other = (int)(Math.random()*40);
                }while(d1.equals(herd.get(other)));
                if(herd.get(other).getAge() !=-1)
                    if(d1.isMate(herd.get(other)))
                    {
                        System.out.println(d1.getType()+" MATE!!");
                        for(int j = 0; j<4; j++)
                            if (d1 instanceof TRex)
                                herd.add(new TRex());
                            else if(d1 instanceof Velo)
                                herd.add(new Velo());
                    }
                    else
                        d1.attack(herd.get(other));
                else
                    System.out.println(herd.get(other)+" He's dead");
            }
            else
                System.out.println(d1+" I'm dead");
        }
        
        int count = 1;
        for(Dinosaur d : herd)
        {
            System.out.println(count+" "+d);
            count++;
        }
        
        for(int i = 0; i<herd.size(); i++)
        {
            if (herd.get(i).getAge() == -1)
            {
                System.out.println(herd.get(i));
                herd.remove(i);
            }
            
        }


        System.out.println("Total number of living dinos: "+herd.size());
//         
//         
    }
}