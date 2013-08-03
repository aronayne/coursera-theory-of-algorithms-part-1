package week2.stacks.and.queues

/**
 * Since scala implements Stack for hierarchical purposes, I'm using
 * a List implementation. 
 * Refer to http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Stack
 *
 * This is an immutable implementation 
 * */

class TwoStackAlgorithm() {
  
  var operators = List[String]()
  var values = List[Double]()
  
  def evaluate(expression : List[String]) : Unit = expression match {
    
    case List() => {println("Value is "+values.head)}
    case head :: tail => {
      if(head.==("+")){
        operators = operators.::(head)
      }
      else if(head.==(")")){
        
        //Why cannot set type to operator here ??
        var operator = operators.head
        println("operator is "+operator)
        
        //remove the first operator from the list
        operators = operators.tail;
        

        if(operator.==("+")){
          
          var value1 = values.head
          values = values.tail
          var value2 = values.head
          values = values.tail
          println("Adding to values "+value1 + value2)
          values = values.::(value1 + value2)
        }
      }  
      else if (head.==("(")){}
        else {
          println("Appending to values list")  
          values = values.::(java.lang.Double.valueOf(head.toString))
        }
      println("head is "+head)
      evaluate(tail)
    }

  }
  

}