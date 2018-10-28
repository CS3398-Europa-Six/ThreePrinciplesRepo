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
   @DisplayName("Testing set/get name")
   public void testWorkerWithName()
   {
      w.setName("John Doe");
      assertEquals(w.getName(),"Jane Doe");
   }

   @Test
   @DisplayName("Testing worker object")
   public void testWorkerWithName()
   {
      Worker worker = new Worker();
      assertNotNull(worker);
   }
}
