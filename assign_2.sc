import scala.collection.mutable.ArrayBuffer

object assign_2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val test_arr = ArrayBuffer[Int](2,0,-2,-1,5,2,0,-7,3,0);
                                                  //> test_arr  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 0, -2
                                                  //| , -1, 5, 2, 0, -7, 3, 0)
  //remove duplicated item
  val m = test_arr.length                         //> m  : Int = 10
  
  var temp = new ArrayBuffer[Int](m)              //> temp  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
  test_arr.distinct                               //> res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(2, 0, -2, -1, 
                                                  //| 5, -7, 3)
  
  def remove_fir_neg(arr: ArrayBuffer[Int]) :Array[Int] = {
  	 //var dist = new Array[Int](arr.length)
  	 var i : Int = 0
     val dist = for(i <- arr.indices if arr(i) < 0) yield i

		 dist.reverse
		 for(i <- dist.reverse.toArray.init)
		 		arr.remove(i)
     //val dist_pos = dist(1:arr.length)
     //dist.reverse.toArray
     arr.toArray
  }                                               //> remove_fir_neg: (arr: scala.collection.mutable.ArrayBuffer[Int])Array[Int]
  
  remove_fir_neg(test_arr)                        //> res1: Array[Int] = Array(2, 0, -2, 5, 2, 0, 3, 0)
  
}