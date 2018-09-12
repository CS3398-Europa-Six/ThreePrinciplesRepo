package threesolid;

import java.awt.*;        
// Using AWT container and component classes
import java.awt.event.*;  
// Using AWT event classes and listener interfaces
import java.io.*;




class TempWorker extends BaseWorker implements IEat,ISick {

    @Override
	public void work() {
		//.... working temporarily
        System.out.println("TempWorker.work()");
	}

	
	public void eat() {
		//.... eating in lunch break
	   System.out.println("SuperWorker.eat()");
	}
    
    	public void sick() {
		//.... sick
	   System.out.println("SuperWorker.sick()");
	}


}
