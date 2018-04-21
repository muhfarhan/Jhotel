import java.util.*;

/**
 * Write a description of class RunForYourLife here.
 *
 * @author Muhammad Farhan
 * @version 21 April 2018
 */
public class RunForYourLife implements Runnable {
   private Thread t;
   private String threadName;
   private int delay;
   
   RunForYourLife( String name)
   {
      threadName = name;
      System.out.println(threadName + ", ready.");
   }
   
   public void run()
   {
      System.out.println(threadName + ", go!" );
      try 
      {
         for(int i = 1; i <= 20; i++) 
         {
            System.out.println(threadName + " has passed checkpoint " + "("+ i +")");
            //thread akan berhenti sejenak selama delay
            Thread.sleep(delay);
         }
      }
      catch (InterruptedException e) 
      {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println(threadName + " has finished!");
   }
   
   public void start () {
      System.out.println(threadName + ", set...");
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
   
   public void setDelay (int delay)
   {
       delay = this.delay;
   }
}

