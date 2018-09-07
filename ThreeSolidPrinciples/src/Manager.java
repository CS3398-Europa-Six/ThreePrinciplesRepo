//Nathan Hancock Manager class SOLID Rational

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


// The manager class follows the single responsibility principle
// by being solely responsible for methods and subclasses.
// It is a smaller abstract class which will need to be
// flexible for further modification. Therefor the open close principle
// will not be strictly followed at the begining of development but will
// be applied later once the class is filled. The Interface of the manager
// is a possiblity but currently no interface is used so the interface
// segregation principle does not currently apply.


class Manager{



	public void Manager() {

	}
	public void manage(IWorker w) {
		w.work();
	}
}
