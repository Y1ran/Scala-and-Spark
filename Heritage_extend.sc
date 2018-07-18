object Heritage_extend {

  println("Welcome to the Scala worksheet")
  //val p1 = new Person("bob")
  
  //println(p1.id)
  
  def show(inp: Any) = println(s"${inp.getClass}: $inp")
  show(3)
  show(2,4,5)
  
  val pen = new item("pen",10.1)
  val pencil = new item("pen",10.1)
  
  println(pen == pencil)
  println(pen.equals(pencil),pen.hashCode)
  
  var t = new Militime(100)
  println(t, t.time,t.hours,t.toString)
  
  //println(t.time * 2)
  
  if(t.isInstanceOf[Militime]) {
  	val s = t.asInstanceOf[AnyVal]
  	println(s)
  }
  
  t match{
  	case s: Any => println(s.getClass)
  	case b: Militime => println(b.getClass)
  	case _ => println("not good")
  	}
  
  
  val test = new item("test",11.0) {
  	def greet = "greeting, test"
  }
  
  def meet(it: item{def greet:String}){
  	println(s"${it.descrip} says: ${it.greet}")
  }
  
  meet(test)
}

class item(val descrip:String, val price: Double){

		final override def equals(other:Any) ={
		other.isInstanceOf[item] && {
		
		val that = other.asInstanceOf[item]
		descrip == that.descrip && price == that.price
		
		}
	}
		final override def hashCode = (descrip, price).##

}

class Militime(override val time:Int) extends AnyVal {

	def minutes = time % 100
	def hours = time / 100
	final override def toString = f"${time}04d"

}