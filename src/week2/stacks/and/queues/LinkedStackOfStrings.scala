package week2.stacks.and.queues

class LinkedStackOfStrings {
  
  var first : Node = _

  def isEmpty : Boolean  = {
    first == null
  }
  
  def push(itemName : String) = {
    val oldFirst = first
    first = new Node(itemName , oldFirst)
  } 
  
  def pop = {
    first = first.next
    
    first.itemName
    
  }
  
}

  class Node(val itemName : String , val next : Node) {}
