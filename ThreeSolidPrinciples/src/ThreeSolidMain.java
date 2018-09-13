package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


public class ThreeSolidMain
{   

   public static ProjectManager testProjectManager = new ProjectManager();
   public static ProductManager testProducManager = new Productmanager();
   public static Worker testWorker = new Worker();
   public static SuperWorker testSuperWorker = new SuperWorker();
   public static TempWorker testTempWorker = new TempWorker();
   public static Robot testRobot = new Robot();

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting Test ... \n");
         testProjectManager.schedulework();
         testProductManager.defineproduct();
         testWorker.work();
         testWorker.eat();
         testWorker.sick();
         testSuperWorker.work();
         testSuperWorker.eat();
         testSuperWorker.sick();
         testTempWorker.work();
         testTempWorker.eat();
         testTempWorker.sick();
         testRobot.work();
         testRobot.reboot();
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }
