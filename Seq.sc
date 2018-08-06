object Seq {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val names = List("bob", "peter","alice")        //> names  : List[String] = List(bob, peter, alice)
  
  names.map(_.toUpperCase)                        //> res0: List[String] = List(BOB, PETER, ALICE)
  println(names)                                  //> List(bob, peter, alice)
  
  val new_name = for (n <- names) yield n.toLowerCase
                                                  //> new_name  : List[String] = List(bob, peter, alice)
  println(new_name)                               //> List(bob, peter, alice)
  
  def ulcase(s:String) = Vector(s.toUpperCase, s.toLowerCase)
                                                  //> ulcase: (s: String)scala.collection.immutable.Vector[String]
  names.map(ulcase)                               //> res1: List[scala.collection.immutable.Vector[String]] = List(Vector(BOB, bob
                                                  //| ), Vector(PETER, peter), Vector(ALICE, alice))
  names.flatMap(ulcase)                           //> res2: List[String] = List(BOB, bob, PETER, peter, ALICE, alice)
  
  names.foreach(println)                          //> bob
                                                  //| peter
                                                  //| alice
  val words = List("Alice","bob","Ask")           //> words  : List[String] = List(Alice, bob, Ask)
  val map = words.groupBy(_.substring(0,1).toUpperCase)
                                                  //> map  : scala.collection.immutable.Map[String,List[String]] = Map(A -> List(A
                                                  //| lice, Ask), B -> List(bob))
  
  (1 to 10).scanLeft(0)(_ + _)                    //> res3: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 3, 6, 10, 15
                                                  //| , 21, 28, 36, 45, 55)
  
  def nums(n:Int): Stream[Int] = n #:: nums(n + 1)//> nums: (n: Int)Stream[Int]
  val ten = nums(10)                              //> ten  : Stream[Int] = Stream(10, ?)
  val twl = nums(10).tail.tail.tail               //> twl  : scala.collection.immutable.Stream[Int] = Stream(13, ?)
  nums(11).map(x => x * x).take(10).force         //> res4: scala.collection.immutable.Stream[Int] = Stream(121, 144, 169, 196, 22
                                                  //| 5, 256, 289, 324, 361, 400)
 	val palindrom = (1 to 100000).view.map(
 		x => x * x).filter(x => x.toString == x.toString.
 		reverse && x > 10)                //> palindrom  : scala.collection.SeqView[Int,Seq[_]] = SeqViewMF(...)
 		
 	palindrom.take(10).mkString(",")          //> res5: String = 121,484,676,10201,12321,14641,40804,44944,69696,94249
}