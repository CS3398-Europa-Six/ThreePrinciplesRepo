//Fernando Buenrostro - Europa 6
//Robot class

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;

class Robot implements IWorker{
	public void work() {
		// ....working
	}
}

/*
	The Robot class follows the Single Responsibiity Principle by 
	only having one reason to change, the work function implemented from the
	IWorker interface. Should Robot's application of work change and require a change
	in the code, the change is justified as there would not be any other reason for a change.

	Should the Robot class be inherited, the Open/Closed Principle is satisfied. Reason being
	that the class holds abstract qualities and may be extended to provide new functionality 
	to the base class rather than to modifiy the exisitng base class. 

	The Interface Segregation Principle is not specifically used here but the Robot class
	benefits from the proper use of the ISP. If IWorker and the methods included not have been
	separated, Robot would have access to unncessary code and increase its complexity for no reason.
*/

