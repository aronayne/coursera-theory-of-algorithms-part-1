package week2.elementary.sorts.tests

import week2.elementary.sorts.SelectionSort

object SelectionSortTest {

  def main(args: Array[String]){

    val arr = Array(4 , 3 , 2 , 1, 5)

    val ss = new SelectionSort()
    val a = ss.sort(arr)
    
  }
  
}