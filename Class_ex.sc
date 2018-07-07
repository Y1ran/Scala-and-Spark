import scala.beans.BeanProperty

object Class_ex {
  println("Welcome to the Scala worksheet")
  
  //ex1
  class Counter{
  	@BeanProperty var value:BigInt = 0
  	
  	def increment() {
  
  	value += 1
  	 }
  

  	def current = {
			value
  	}
  }
  
  val myCounter = new Counter
 
  val x: Int = Int.MaxValue
  
  for( i <- 1 until x + 3){
  	myCounter.increment()
  }
  println(myCounter.current)
  
  //ex2
  class BankAccount (@BeanProperty val balance:Int){

  		def deposit( bill: Int) =
  		{
  			var dep: Int = balance + bill
  			println(s"the balance after deposite is: {$dep}")
  		}
  		def withdrow( bill: Int) =
  		{
  			var withs: Int = balance - bill
  			println(s"the balance after withdrow is: {$withs}")
  		}
  		
  		
  }
  
   val banker = new BankAccount(2000)
   banker.balance
   banker.deposit(300)
   banker.getBalance()
   banker.withdrow(700)
   
   //ex3
  class Person(val age: Int){
  	private var private_age = 0
  	
  	def getAge : Int = {
  		if(age < 0){
  			private_age
  		}
  		else { age }
  	
  	}
  	def age_=(newValue: Int) { private_age = newValue }
  	
  	def isLess(other: Person) = private_age < other.private_age
  }
  
  val bob = new Person(22)
  val Alice = new Person(-2)
  bob.age
  Alice.getAge
  Alice.age_=(33)
   //ex4
   
   
   
   
   
   
}