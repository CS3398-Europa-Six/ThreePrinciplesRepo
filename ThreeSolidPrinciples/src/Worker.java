package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*; 

//ISP doesn't apply to this, it's a full class.
//SRP applies to this. Worker is responsible for workers, workers eat and work.
//Open Close principle applies because there is only two very barebones functions, which leaves it open for easy extension into different types of workers (For example
//a tenured worker could have a vacation function)

//import threesolid.IWorker;

class Worker implements IWorker, IFeedable{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in lunch break
	}
}