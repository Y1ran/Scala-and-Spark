object Expr {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x: Int = 1                                  //> x  : Int = 1
  
  val y = x * 3                                   //> y  : Int = 3
  
  def abs(x :Double) = if (x >= 0) x else -x      //> abs: (x: Double)Double
  abs(-10)                                        //> res0: Double = 10.0
  
  
  def fac(n : Int) ={
  	var sum: Int = 1
  	for( i <- 1 to n) {
  		sum = sum * i
  		
  		}
  	sum
  	}                                         //> fac: (n: Int)Int
  
  fac(10)                                         //> res1: Int = 3628800
}