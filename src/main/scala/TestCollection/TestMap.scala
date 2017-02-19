package TestCollection


object TestMap {
  
  
  
  def main(args: Array[String]) {
    
   
    
    
    
    var colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    var colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
    println(colors.mapValues { x => x*2})
    println(colors.keys)
    println(colors.values)
    println(colors.toList)
    
    
    

    println(colors.keys)
    println(colors.values)
    println(colors.isEmpty)
    println(colors("red"))
    println(colors.contains("red"))
    println(colors.contains("kk"))
    println(colors.size)
    println(colors.head)
    println(colors.tail)
    println(colors.take(2))
    println(colors.drop(2))
    println(colors.dropRight(2))
    println(colors ++ colors2)
    println(colors.++ (colors2))
    colors += "k2" -> "v2"
    println(colors)
    var x  = colors += "k2" -> null
    println(colors)
    println(x)
    colors.foreach(x=> println(x._1, x._2))
    colors.foreach{ case(key, value) => println(key, value)} 
    colors.foreach(x=> 
      if(colors.contains("red")){
         colors += (x._1 -> "Green")
      }
    
        )
    println(colors)
    var p1Ratings = Map("Lady in the Water"-> 3.0, 
                    "Snakes on a Plane"-> 4.0,
                    "You, Me and Dupree"-> 3.5)
                    
    p1Ratings.keys.foreach( (movie) => 
    if (p1Ratings.contains(movie)) 
        p1Ratings += (movie -> 4.0)
    )
    println(p1Ratings)
    colors =  colors +("yellow"-> "jjj")
    colors = colors.+("yellow1"-> "jjj")
    println(colors)
    colors = colors.-("yellow1")
    println(colors)
    println(colors.toList)
    val someMap = Map(1 -> 'a', 2 -> 'b')
//    val mapped = someMap map { case (k, v) => "result % d % c".format(Int, Char) }
//    println(mapped)
    
    
    
  }
  
}