package threesolid;

import java.awt.*;        
// Using AWT container and component classes
import java.awt.event.*;  
// Using AWT event classes and listener interfaces
import java.io.*;


//import threesolid.IWorker;



// This class exhibits the single responsibility principle because it is keeping the  
// class minimalized so that way it only focuses on the superworkers as oppose to many 
// different groups, as such they will be the only ones that need to really have it changed.
// As for the open closed, it only really shows half of this because it can be extended if a
// class inherits this class, but it also can be modified if someone wants to expand on the
// functions of the superworker class. The Interface Segregation principle doesn't really 
// apply to this one. 

// Reasoning by Trenton H.





class SuperWorker extends BaseWorker implements IEat,ISick {

    @Override
	public void work() {
		//.... working much more
        System.out.println("SuperWorker.work()");
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
