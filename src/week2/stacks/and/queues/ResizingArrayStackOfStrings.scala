package week2.stacks.and.queues


class ResizingArrayStackOfStrings() {
  var s: Array[String] = new Array(1)
  var N: Int = 0

  def isEmpty: Boolean = {
    N == 0
  }
  
  def push(item: String) = {
	  if(N == s.length) resize(2 * s.length)
	  N = N + 1
	  s(N) = item
  }

  def resize(capacity : Int){             
	  val copy : Array[String] = new Array(capacity)
	  
	  for( a <- 0 to N){
	    copy(a) = s(a)
      }

	  s = copy
  }
  
  def pop = {
    this.N = N - 1
    val item: String = s(N)

    /**
     * Setting this object to null so
     * that JVM garbage collection can clean it up
     */
    s(N) = null
    if(N > 0 && N == s.length / 4){
      resize(s.length / 2)
    }
    

    item
  }
}

object ResizingArrayStackOfStrings {
  def apply() : ResizingArrayStackOfStrings = {
    new ResizingArrayStackOfStrings()
  }
}