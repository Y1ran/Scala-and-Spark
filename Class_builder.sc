import scala.beans.BeanProperty
import scala.collection.mutable.ArrayBuffer

object Class_builder {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  class network {
  
  println("this is new network")
  class Member( val name: String){
  	println("new contacts created")
    val contacts = new ArrayBuffer[Member]
  }
  
  private val members = new ArrayBuffer[Member]
  
  def join(name: String): Member={
    val m = new Member(name)
    m.contacts += m
    m
  }

}
  val Chatter = new network                       //> this is new network
                                                  //| Chatter  : Class_builder.network = Class_builder$network$1@341b80b2
  val MyFace = new network                        //> this is new network
                                                  //| MyFace  : Class_builder.network = Class_builder$network$1@55a1c291
  
 	val Fred = Chatter.join("Fred")           //> new contacts created
                                                  //| Fred  : Class_builder.Chatter.Member = Class_builder$network$1$Member@2890c4
                                                  //| 51
  //Chatter.members
  println(Fred.contacts)                          //> ArrayBuffer(Class_builder$network$1$Member@2890c451)
  

}