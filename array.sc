import scala.collection.mutable.ArrayBuffer

object array{
  println("Welcome to the Scala worksheet")
  
  val nums = new Array[Int](10)
  val s = 1
  
  def RandArray(n:Int) : Array[Int] = {
  
  	val temp = new ArrayBuffer[Double](n)
  	for( i <- 0 to n )
  		temp += 0
  		
  	val a = for ( i <- temp.indices )
 	  	yield (new util.Random).nextInt(n)
    
    a.toArray
  	}
  	
  RandArray(10)
 
  def PosNeg( inp: Array[Int] ) : Array[Int] = {
  	//val s = Array[Int](2,0,-2,-1,5,2,0,7,3,0)
  	val inp_pos = for (i <- inp) yield i
  	val inp_neg = for (i <- inp) yield i
  	
  	val pos = for ( i <- inp.indices if inp(i) > 0 ) yield i
  	val neg = for ( j <- inp.indices if inp(j) <= 0 ) yield j
  	for ( k <- pos.indices )
  		inp(k) = inp_pos(pos(k))
  	
    val remain : Int = inp.length - neg.length
    for ( c <- neg.indices )
  		inp(c + remain) = inp_neg(neg(c))
  		
  	inp
  }
  val test_arr = Array[Int](2,0,-2,-1,5,2,0,7,3,0);
  PosNeg(test_arr)
 
  
}