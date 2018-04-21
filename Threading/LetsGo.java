import java.util.*;

/**
 * Write a description of class LetsGo here.
 *
 * @author Muhammad Farhan
 * @version 21 April 2018
 * referensi http://forums.codeguru.com/showthread.php?442673-Random-Sleep-Time
 */
public class LetsGo
{
   //inisiasi variable
   public static int delayL,delayA,delayM;
   private static Random random = new Random(); 
   
   public static void main(String args[])
   {
       //memasukkan nilai, int delay = random.nextInt((max_value-min_value)+min_value) 
       //random delayL terlama, delayA kedua terlama, delayM paling cepat
       delayL = random.nextInt((500-100)+100);
       delayA = random.nextInt((delayL-100)+100);
       delayM = random.nextInt((delayA-100)+100);
       
       RunForYourLife Lionel = new RunForYourLife( "Lionel");
       Lionel.setDelay(delayL);
       Lionel.start();
      
       RunForYourLife Andres = new RunForYourLife( "Andres");
       Andres.setDelay(delayA);
       Andres.start();
      
       RunForYourLife Messi = new RunForYourLife( "Messi");
       Messi.setDelay(delayM);
       Messi.start();
   }   
}

