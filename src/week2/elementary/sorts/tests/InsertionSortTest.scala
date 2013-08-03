package week2.elementary.sorts.tests

import week2.elementary.sorts.InsertionSort

object InsertionSortTest {

  def main(args: Array[String]){

    val arr = Array(4 , 3 , 2 , 1, 5)

    val ss = new InsertionSort()
    val a = ss.sort(arr)
    
     for(i <- 0 until a.length - 1){
      println("Ordered "+a(i))
    }
    
  }
  
}