object Object_class {
  
 def main(args: Array[String]){
  println("Welcome to the Scala worksheet")
  }                                               //> main: (args: Array[String])Unit
  //ex1
	Conversions(10)                           //> this is a super class
                                                  //| this is a super class
                                                  //| 10
                                                  //| res0: Conversions = Conversions@1e67a849
	val test = new Conversions(10)            //> this is a super class
                                                  //| 10
                                                  //| test  : Conversions = Conversions@57d5872c
	val test_new = test.cent                  //> test_new  : Int = 1000
	println(test_new, test)                   //> (1000,Conversions@57d5872c)
	
	
  	//ex2
	object Origin extends java.awt.Point{
	setLocation(22,1)
	println(getLocation())
	}
	
		//ex3
  
}

object hello extends App{
	 println("Welcome to the Scala worksheet")
}

object test{
	object Traffic extends Enumeration{
		val red, yellow, green = Value
}
	import Traffic.red
	
	println(Traffic.red.toString())

}

class Conversions(input: Int) extends UnitConversion {

	println(input)
	val cent = trans(input)
	

}

object Conversions extends UnitConversion {

	//def apply(input : Int) = new Conversions(input)
	var input: Int = Conversions.input
	//private def trans(input: Int) = { var res = input * 100; res}
}

abstract class UnitConversion() {
	println("this is a super class")
	def apply(input : Int) = new Conversions(input)
	def trans(input: Int) = { var res = input * 100; res}
}

object Origin extends java.awt.Point{
	setLocation(22,1)
	getLocation()
}

object test_app extends App{
	
	println("run")

}