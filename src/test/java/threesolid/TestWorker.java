package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private  Worker w = new Worker();
	
   @Test
   @DisplayName("No Name Test")
   public void testWorkerWithNoName()
   {
      assertEquals(w.getName(),"");
      assertEquals(w.work(),"I'm working already!");
   }

   @Test
   @DisplayName("With Name Test")
   public void testWorkerWithName()
   {
      w.setName("Corvus Glaive");
      assertEquals(w.getName(),"Corvus Glaive");
      assertEquals(w.work(),"Corvus Glaive is working very hard!");
   }

   @Test
   @DisplayName("Successful Not Null test")
   public void newtestFBWorkerPass(){
   		String fName = "Fernando";
   		String lName = "Buenrostro";
   		String fullName = fName + lName; //assign value of fullName
         assertNotNull(fullName);	//fullName will pass as it is not null
   }

  @Test
   @DisplayName("Unsuccessful Not Null test")
   public void newtestFBWorkerPass(){
   		String fName = null;
         assertNotNull(fName);	//fName will not pass as it is null
   }



}