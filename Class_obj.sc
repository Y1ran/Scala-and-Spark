import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer

object Class_obj {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class Counter{
  	@BeanProperty var value:Int = 0
  	
  	def increment() { value += 1}
  	def current = value
  }
  
  val myCounter = new Counter()                   //> myCounter  : Class_obj.Counter = Class_obj$Counter$1@2ea6137
  myCounter.increment()
  println(myCounter.current); println(myCounter.getValue())
                                                  //> 1
                                                  //| 1
  println(myCounter.setValue(22))                 //> ()
  println(myCounter.value)                        //> 22
  myCounter.value_=(33)
  println(myCounter.value)                        //> 33
  //no paramater can ignore ()
  
  class Person{
  	private var private_age = 0
  	
  	def age : Int = private_age
  	def age_=(newValue: Int) { private_age = newValue }
  	
  	def isLess(other: Person) = private_age < other.private_age
  }
  val Fred = new Person                           //> Fred  : Class_obj.Person = Class_obj$Person$1@36f0f1be
  println(Fred.age)                               //> 0
  Fred.age_=(21)
  println(Fred.age)                               //> 21

}