object Quick_sort {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def qsort(arr: List[Int]) : List[Int] = {
  	if (arr.length < 2) arr
  	else
  		qsort(arr.filter(_ < arr.head)) ++
  			arr.filter( _ == arr.head) ++
  				qsort(arr.filter( _ > arr.head))
  }                                               //> qsort: (arr: List[Int])List[Int]
  
  val test = List(1,3,2,5,1,0,9)                  //> test  : List[Int] = List(1, 3, 2, 5, 1, 0, 9)
  val out = qsort(test)                           //> out  : List[Int] = List(0, 1, 1, 2, 3, 5, 9)
  println(out)                                    //> List(0, 1, 1, 2, 3, 5, 9)
  
  import scala.math._
  
  val fun = ceil _                                //> fun  : Double => Double = Quick_sort$$$Lambda$17/444920847@23282c25
  //println(fun)
  fun(3.14)                                       //> res0: Double = 4.0
  
  val arr = Array(3.14,1.42,2.0).map(fun)         //> arr  : Array[Double] = Array(4.0, 2.0, 2.0)
  
  val f = (inp:Array[Double]) => inp.reduce( (x,y) => x * y )
                                                  //> f  : Array[Double] => Double = Quick_sort$$$Lambda$21/341878976@4f638935
  def value(f:(Array[Double]) => Double)(inp : Array[Double]) = f(inp)
                                                  //> value: (f: Array[Double] => Double)(inp: Array[Double])Double
  val t = Array(9.42, 4.26, 6.0)                  //> t  : Array[Double] = Array(9.42, 4.26, 6.0)
  
  def runTread(block: => Unit){
  	new Thread {
  		override def run() { block }
  	}.start()
  }                                               //> runTread: (block: => Unit)Unit
  
  runTread{() => println("HI");Thread.sleep(1000); println("bye")}
  
  def Until(condition: => Boolean)(block: => Unit){
  	if(!condition){
  		block
  		Until(condition)(block)
  	}
  }                                               //> Until: (condition: => Boolean)(block: => Unit)Unit
  
  var x = 10                                      //> x  : Int = 10
  Until( x == 0){
  	x -= 1
    println(x)

  	}                                         //> 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  
}