package week2.stacks.and.queues

class LinkedStackGeneric {
  
  var first : NodeGeneric = _
		  
  def isEmpty : Boolean  = {
    first == null
  }
  
  def push(itemName : Any) = {
    val oldFirst = first
    first = new NodeGeneric(itemName , oldFirst)
  } 
  
  def pop = {
    
    val ret = first.itemName
    first = first.next
    ret
    
  }
  
}

  class NodeGeneric(val itemName : Any , val next : NodeGeneric) {}
