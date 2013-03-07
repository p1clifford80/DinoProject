
/**
 * Write a description of class DinoDriver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DinoDriver3
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
        
        
        
        for(int time =0; time<50; time++)
        {
            for(Dinosaur d : herd)
                d.setAge((d.getAge()+1));
                
            int births = 0, deaths = 0;
            if (herd.size()<1)  return;
            
            for(int i=0; i<herd.size(); i++)
            {
                Dinosaur d1 = herd.get(i);
                if(d1.getAge()> 5)
                {
                    int other;
                    do
                    {
                        other = (int)(Math.random()*herd.size());
                    }while(d1.equals(herd.get(other)));
                    if(herd.get(other).getAge() !=-1)
                        if(d1.isMate(herd.get(other)))
                        {
                            System.out.println(d1.getType()+" MATE!!");
                            births+=5;
                            for(int j = 0; j<5; j++)
                                if (d1 instanceof TRex)
                                    herd.add(new TRex());
                                else if(d1 instanceof Velo)
                                    herd.add(new Velo());
                        }
                        else
                            d1.attack(herd.get(other));
                }
            }
            
    
            
            for(int i = 0; i<herd.size(); i++)
            {
                if (herd.get(i).getAge() == -1)
                {
                    herd.remove(i);
                    deaths++;
                }
            }
    
            System.out.println("\n**************  Year "+(time+1)+"   ************************");
            System.out.println("Total number of living dinos: "+herd.size());
            System.out.println("Total births: "+births+"\tTotal deaths: "+deaths);
        }
        
        for(Dinosaur d : herd)
            System.out.println(d);
//         
//         
    }
}