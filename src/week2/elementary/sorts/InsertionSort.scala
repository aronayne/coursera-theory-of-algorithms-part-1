package week2.elementary.sorts

class InsertionSort {

  def sort[T <% Ordered[T]](a: Array[T]): Array[T] = {

    var N = a.length

    for (i <- 0 until N) {

      var j = i
      for (i <- (j to 0 by -1))

        if (a(j) < a(j - 1)) { // call less directly on Ordered[T]
          exchange(a, j, j - 1)
        }
    }
    
    a
  }

  def exchange[T](a: Array[T], i: Integer, j: Integer) = {
    var swap = a(i)
    a(i) = a(j)
    a(j) = swap
  }

}