import java.util.*;
public class roolingPairDices 
{   private static int RollDice()
    {
        Random r=new Random();
        return r.nextInt(6)+1; // r.nextInt will generate only 0-5 ints but we exclude 0 and include 6;
    }
    public static void main(String args[]) 
    {
        int SucessfulAttempts=0;
        for(int i=0;i<10;i++)
        {
            int dice1=RollDice();
            int dice2=RollDice();
            System.out.println("Roll "+(i+1)+" : dice1: "+dice1+", dice2: "+dice2);
            if(dice1==dice2)
            {
                SucessfulAttempts++;
                System.out.println("Sucessful! same values on both dices");
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("\nTotal sucessful Attempts are: "+SucessfulAttempts);
    }
};
