object Unapply_opera {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val author = "cay Hosrt"                        //> author  : String = cay Hosrt
  val Name(first, last) = author                  //> first  : String = cay
                                                  //| last  : String = Hosrt
  
  println(first +':' + last)                      //> cay:Hosrt
  class Name(name: String){
  	
  }
  case class Currency(value: Double, unit: String)
  
  object Name{
  
  	//def unapply(input: String) :Boolean = input.contains(" ")
  	
  	def unapply(input : String): Option[(String,String)] ={
  		val pos = input.indexOf(" ")
  		if ( pos == -1) None
  		else Some((input.substring(0,pos), input.substring(pos+1)))
  	}
  	
  	def isEmpyt(input : String){
  		if (input.length == 0)
  		 None
  	}
  
  }

 	
  
}