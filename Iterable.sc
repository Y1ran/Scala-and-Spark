import scala.collection.mutable.ArrayBuffer

object Iterable {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val coll = List(1,2,3)                          //> coll  : List[Int] = List(1, 2, 3)
  val iter = coll.iterator                        //> iter  : Iterator[Int] = non-empty iterator
  
  while(iter.hasNext){
  	println(iter.next)
  }                                               //> 1
                                                  //| 2
                                                  //| 3
  //val test: Iterable[Int] = Iterable(10)
  
  Set("Hello","world")                            //> res0: scala.collection.immutable.Set[String] = Set(Hello, world)
  val buf = Set("Hello","world").to[ArrayBuffer]  //> buf  : scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(Hello, wor
                                                  //| ld)
  println(buf)                                    //> ArrayBuffer(Hello, world)
  
  def digits(n :Int): Set[Int] ={
  
  if(n < 0) digits(-n)
  else if ( n < 10) Set(n)
  else digits(n / 10) + (n % 10)
  
  }                                               //> digits: (n: Int)Set[Int]
  
  digits(1322132)                                 //> res1: Set[Int] = Set(1, 3, 2)
  
  def sum(lst: List[Int]) : Int={
  	if (lst == Nil) 0
  		else lst.head + sum(lst.tail)
  }                                               //> sum: (lst: List[Int])Int
  
  val out = sum(coll)                             //> out  : Int = 6
  
}