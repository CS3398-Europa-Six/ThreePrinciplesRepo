package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


public class ThreeSolidMain
{   
   // The entry main() method
   public static void main(String[] args) 
   {
       ProjectManager testProjectManager = new ProjectManager();
       ProductManager testProductManager = new ProductManager();
       Worker testWorker = new Worker();
       SuperWorker testSuperWorker = new SuperWorker();
       TempWorker testTempWorker = new TempWorker();
       Robot testRobot = new Robot();

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

       System.out.format("Stopping ... \n");               

   }
 }
