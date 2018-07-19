import scala.util.Random
import scala.collection.parallel.mutable.ParArray
import scala.collection.parallel.mutable.ParHashMap
import scala.collection.parallel.mutable.ParHashSet
       
import scala.collection.parallel.immutable.ParRange
import scala.collection.parallel.immutable.ParHashMap
import scala.collection.parallel.immutable.ParHashSet
import scala.collection.parallel.immutable.ParVector
import scala.collection.GenSeq

object Monte_Carlo {
  println("Welcome to the Scala worksheet")
  
  
  def MC_sample(iter: => Int) :Int ={
  val randomX = new Random
  val randomY = new Random
  
  var hits = 0
  for(i <- 0 until iter) {
  		val x = randomX.nextDouble
  		val y = randomX.nextDouble
  		
  		if( x * x + y * y < 1) hits = hits +1
  	}
  	hits
  }
  
  def Pi_cal(iter: => Int) :Double ={
  		val hits = MC_sample(iter)
  		
  		val pi = 4.0 * hits / iter
  		
  		pi
  
  }
  
  def MC_para(iter:Int) :Double = {
  		val ((pi1,pi2),(pi3,pi4)) = parallel(
  				parallel(MC_sample(iter/4),MC_sample(iter/4)),
  				parallel(MC_sample(iter/4),MC_sample(iter - 3*(iter/4))))
  		val pi = 4.0 * (pi1 + pi2 + pi3 + pi4) / iter
  		
  		pi
  }
  
  val result = Pi_cal(10000000)
  println(result)
  
}