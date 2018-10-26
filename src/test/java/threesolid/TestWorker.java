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
    

    private Worker www;

   @Test
   @DisplayName("This test will pass because www is null")
   public void newtestCLPWorkerPass()
   {
      boolean fl = true;
      assertTrue(fl,"This bool is true, so won't fail here");
      assertNull(www);
   }

    
   private String time = "Money";
    
   @Test
   @DisplayName("Fail test in worker")
   public void newtestCLPWorkerFail()
   {
      assertNotEquals(time,"Money");
   }
    
    
}