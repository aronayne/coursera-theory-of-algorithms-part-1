package week2.elementary.sorts

/**
 * For deeper understanding refer to http://stackoverflow.com/questions/16202426/how-to-add-arrayorderedany-as-a-method-parameter
 */
class SelectionSort {

  def sort[T <% Ordered[T]](a : Array[T]) : Unit = {
    var N = a.length
 
    for (i <- 0 until N) {
        var min = i

        for(j <- i + 1 until N){
            if(a(j) < a(min)){ // call less directly on Ordered[T]
              min = j
            }
        exchange(a , i , min)
        }
    }

    for(i <- 0 until N){
      println("Ordered "+a(i))
    }
  }

  def exchange[T](a : Array[T] , i : Integer , j : Integer) = {
    var swap = a(i)
    a(i) = a(j)
    a(j) = swap
  }
}