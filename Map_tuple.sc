import scala.collection.mutable.Map
import java.util.Calendar._

object Map_tuple {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //ex1
  val equ = Map("sword" -> 1, "helmet" -> 4)      //> equ  : scala.collection.mutable.Map[String,Int] = Map(helmet -> 4, sword -> 
                                                  //| 1)
  val discount_equ = for((k,v) <- equ ) yield (k, v * 0.9)
                                                  //> discount_equ  : scala.collection.mutable.Map[String,Double] = Map(helmet -> 
                                                  //| 3.6, sword -> 0.9)
  
  //ex2
def count_words(inp: String):Map[String, Int]={
  val count = scala.collection.mutable.SortedMap[String, Int]()
 
  for( word <- inp.split(",")){
 
    count(word) = count.getOrElse(word, 0) + 1
    //val sorted_count = count.toSortedMap

  }
  count
  }                                               //> count_words: (inp: String)scala.collection.mutable.Map[String,Int]
  
  val inp: String = "please,take,it,it,easy"      //> inp  : String = please,take,it,it,easy
   count_words(inp)                               //> res0: scala.collection.mutable.Map[String,Int] = TreeMap(easy -> 1, it -> 2,
                                                  //|  please -> 1, take -> 1)
   //ex3
  val weeks = scala.collection.mutable.LinkedHashMap[String, Int]("Sunday" -> SUNDAY, "Monday" -> MONDAY)
                                                  //> weeks  : scala.collection.mutable.LinkedHashMap[String,Int] = Map(Sunday -> 
                                                  //| 1, Monday -> 2)
   
  //ex4
  //var java1 = java.runtime.time
  //val table = scala.collection.mutable.Map("java.vm.version" -> java1)
  
  //ex5
  def minmax(values: Array[Int]): Tuple2[Int,Int]={
  	val max = values.toBuffer.max
  	val min = values.toBuffer.min
  	val tuple = (min -> max)
  	tuple
  }                                               //> minmax: (values: Array[Int])(Int, Int)
  
  val test_array = Array[Int](1,4,5,2,6,7,0)      //> test_array  : Array[Int] = Array(1, 4, 5, 2, 6, 7, 0)
  minmax(test_array)                              //> res1: (Int, Int) = (0,7)
  
  //ex6
def Find_value(values: Array[Int], v: Int): Tuple3[Int,Int,Int]={
  	val lst = for(i <- values if i < v) yield i
  	val equal = for(i <- values if i == v) yield i
  	val bgt = for(i <- values if i > v) yield i
  	
  	val min = lst.length
  	val mid = equal.length
  	val max = bgt.length
  	
  	val tuple = (min, mid, max)
  	tuple
  }                                               //> Find_value: (values: Array[Int], v: Int)(Int, Int, Int)
  
  Find_value(test_array, 4)                       //> res2: (Int, Int, Int) = (3,1,3)
}