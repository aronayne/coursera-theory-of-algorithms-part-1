package week2.stacks.and.queues.tests

import week2.stacks.and.queues.TwoStackAlgorithm

object TwoStackAlgorithmTest {
  
  def main(args: Array[String]){
    
   println("*********** testing TwoStackAlgorithm *****************")
   
   val tsa = new TwoStackAlgorithm();
   tsa.evaluate(List("(" , "1" , "+" , "6" , ")"))
   
  }

}