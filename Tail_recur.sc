object Tail_recur {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //@scala.annotation.tailrec
  def fact(n: Int, m: Int) : Int ={
  	if ( n <= 0) m
  	else fact( n-1 , m * n)
  	}                                         //> fact: (n: Int, m: Int)Int
 
		fact(10,1)                        //> res0: Int = 3628800

		
		def sum(f: Int => Int)(a:Int)(b:Int): Int={
			@scala.annotation.tailrec
			def loop(n:Int, acc:Int): Int={
				if( n > b ) {
					println(s"n=${n}, acc = ${acc}")
					acc
				}
				else {
					println(s"n=${n}, acc = ${acc}")
					loop(n + 1, acc + f(n))
				}
			}
		
		loop(a,0)
		}                                 //> sum: (f: Int => Int)(a: Int)(b: Int)Int
		
		sum(x => x)(1)(5)                 //> n=1, acc = 0
                                                  //| n=2, acc = 1
                                                  //| n=3, acc = 3
                                                  //| n=4, acc = 6
                                                  //| n=5, acc = 10
                                                  //| n=6, acc = 15
                                                  //| res1: Int = 15
		
}