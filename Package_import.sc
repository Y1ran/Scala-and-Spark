import scala.math._

package random{
object Package_import {
	
  println("Welcome to the Scala worksheet")

  //ex1
  //val seed = setSeed(100)
  var new_rand = nextInt()
  println(new_rand)
  
  }
}

package object random{
	final val a = 1664525
	final val b = 1013904223
	val n: Int = 32
	
	def setSeed(seed: Int) : Int = seed
	val seed = setSeed(100)
	def nextInt(): Int = ((seed * a + b).toDouble  %  (scala.math.pow(2,n)).toDouble).toInt
	def nextDouble(): Double =((seed * a + b)  %  scala.math.pow(2,n)).toDouble

}


		
	