import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer
import java.io._

object Trait_class {
  println("Welcome to the Scala worksheet")
  
  trait Logger {
  	def log(msg: String) //
  }
  
  class ConsoleLogger extends Logger{
  	override def log(msg: String) {println(msg)}
  }
  
  trait ConsoleLog {
  	def log(msg: String) { println(msg)}
  }
  

  	
  val bob = new ConsoleLogger()
  bob.log("take it while")
  
  abstract class Account extends Logger{
  	def withdraw(amount: Double){
  		log(s"abstract can bo instantiated")
  		}
  	//override def log(msg: String)
  }
  
	 val acct = new Account with ConsoleLog
   acct.withdraw(11.0)
   //acct.log("msg")
  
  trait TimestampLogger{
  	def log(msg: String){
  		log(s"${java.time.Instant.now()} $msg")
  	}
  
  }
  
  class test extends TimestampLogger
  {
  	log("this is a test")
  }
  
  val s = new test
  s.log("bbc")
  
  trait FileLogger extends ConsoleLog{
  	lazy val out = new PrintWriter("app.log")
  	out.println(s"# ${java.time.Instant.now()} ")
  	
  	override def log (msg: String) {
  			out.println(msg); out.flush()}
  
  }
  
  
  
}
  