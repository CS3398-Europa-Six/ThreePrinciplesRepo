package threesolid;

import java.awt.*;
// Using AWT container and component classes
import java.awt.event.*;
// Using AWT event classes and listener interfaces
import java.io.*;




class TempWorker extends BaseWorker implements IEat,ISick {

    @Override
	public string work() {
		//.... working temporarily
        	return "TempWorker.work()";
	}


	public void eat() {
		//that's a 2 hour lunch right?
	   System.out.println("TempWorker.eat()");
	}

    public void sick() {
		//calls out regularly
	   System.out.println("TempWorker.sick()");
	}


}
