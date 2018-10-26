package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestGreeter {

   private  Manager m = new Manager();
	
   @Test
   @DisplayName("Test manager should not be null")
   public void newtestCLPTestPass()
   {
      assertNotNull(m);
   }


}