object Java_hashmap {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  import java.util.{HashMap => JavaHashMap}
  import collection.mutable.HashMap
  
  val j_map = new JavaHashMap[String,Int](10)     //> j_map  : java.util.HashMap[String,Int] = {}
  //println(j_map)
  j_map.put("test",1)                             //> res0: Int = 0
  j_map.put("tesd",2)                             //> res1: Int = 0
  
	println(j_map)                            //> {test=1, tesd=2}
	
	val s_map = new HashMap[String, Int]()    //> s_map  : scala.collection.mutable.HashMap[String,Int] = Map()
	var i = 0                                 //> i  : Int = 0
	val iter = j_map.keySet().iterator()      //> iter  : java.util.Iterator[String] = java.util.HashMap$KeyIterator@2c34f934
                                                  //| 
	
  for( i <- 1 until 10){
	
	if(iter.hasNext()){
 		var key = iter.next()
		s_map.put(key,j_map.get(key))
	}
	}
	
	println(s_map)                            //> Map(tesd -> 2, test -> 1)
}