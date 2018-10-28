package threesolid;

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestWorker {

   private  Worker w = new Worker();
	
   @Test
   @DisplayName("Phil Test")
   public void newtestPTWorkerPass()
   {
      assertEquals(w.work(),"I'm working already!");
   }

   @Test
   @DisplayName("With Name Test")
   public void newtestPTWorkerFail()
   {
     assertEquals(w.work(),"Failed Test");
    }

}