package week2.stacks.and.queues.tests

import week2.stacks.and.queues.LinkedQueueOfStrings
import week2.stacks.and.queues.LinkedStackGeneric
import week2.stacks.and.queues.LinkedStackOfStrings
import week2.stacks.and.queues.FixedCapacityStackOfStrings

object StacksAndQueuesTest {
 
def main(args: Array[String]){
   val f = FixedCapacityStackOfStrings(5)
   f.push("test");
   println(f.isEmpty);
   f.pop
   println(f.isEmpty);
   
   println("*********** testing LinkedStackOfStrings *****************")
   val l = new LinkedStackOfStrings()
   l.push("ltest")
   l.push("ltest1")
   println(l.isEmpty)
   l.pop
   println(l.isEmpty)
   //l.pop
   println(l.isEmpty)
   
   println("*********** testing LinkedQueueOfStrings *****************")
   val linkedQueueOfStrings = new LinkedQueueOfStrings()
   linkedQueueOfStrings.enqueue("etest");
   println(linkedQueueOfStrings.isEmpty)
   println("De queueing "+linkedQueueOfStrings.dequeue)
   println(linkedQueueOfStrings.isEmpty);
   
   
   println("*********** testing LinkedStackGeneric *****************")
   val generic = new LinkedStackGeneric
   generic.push("test")
   generic.push(11235);
   println(generic.isEmpty)
   println(generic.pop);
   println(generic.isEmpty)
   println(generic.pop);
   println(generic.isEmpty)

  }
 
    
}