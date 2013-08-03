package week2.stacks.and.queues

class FixedCapacityStackOfStrings(capacity: Int) {
  var s: Array[String] = new Array(capacity)
  var N: Int = 0

  def isEmpty: Boolean = {
    N == 0
  }
  
  def push(item: String) = {
    this.N = N + 1
    s(N) = item
  }

  def pop = {
    this.N = N - 1
    val item: String = s(N)

    /**
     * Setting this object to null so
     * that JVM garbage collection can clean it up
     */
    s(N) = null
    item
  }
}

object FixedCapacityStackOfStrings {
  def apply(capacity: Int) : FixedCapacityStackOfStrings = {
    new FixedCapacityStackOfStrings(capacity)
  }
}