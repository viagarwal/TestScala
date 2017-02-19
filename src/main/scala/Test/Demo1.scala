package Test



object Demo1 {
   def main(args: Array[String]) {
     
     def foo[A, B](f: A => List[A], b: B) = f
     
     
     
     
//     def foo[A, B](f: A => List[A], b: B) = f(b);
     
     
     
     
    def id[T](x: T) = x
     
     
//      var a=0;
//      for (a <- 1 to 10 by 2){
//        println(a)
//      }
      for (b <- 10 to 1 by -2){
        println(b)
      }
      
      println( "multiplier(1) value = " +  multiplier(1,"Vipul") )
      println( "multiplier(2) value = " +  multiplier(2, "Vivek") )
      var floatVar = 12.456
      var intVar = 2000
      var stringVar = "Hello, Scala!"
      println(stringVar.length())
      var fs = printf("Value of Float Variable is %f,Value of int variable is %d , Value of Syring variable is %s",floatVar, intVar, stringVar)
      print(fs)
      var x = new Array[String](3);
//      x(0) ="vipul"
//      x(1) ="vv";
//      x(2) ="jjjj";
      x = Array("a", "b", "c")
      var xlist = x.toList
      println(x.indexOf("c"))
      println("#########")
      println(x.size)
      println(xlist.takeRight(2))
      println(xlist.take(2))
      
      val (left, right) = List(5,6,7,8,9).splitAt(2)
      println(left)
      println(right)
      
      println(x.length)
      var s = Set(1,3,5,7)
      s+=400;
      println(s.contains(1))
      println(s.size)
      println(s)
      println(s zip(1 to 5) toMap)
//      var 
      
      println("***")
      println(xlist)
      for(y<- 0 to (x.length-1))
      {
        println(x(y))
      }
      
      
      var myMatrix = Array.ofDim[Int](3,3)
      var x1 = List(1,2,3,45);
      print(x1(0))
      print(x1.sum)
      var x2 = 6:: x1
      print(x2)
      print(x2.sorted)
      print(x2.reverse)
      val tup = (1,2,3,4)
      print(tup._1)
      println(tup.toString())
      val t = new Tuple2(1,2)
      println(t.swap)
         var colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
         colors += "blue"-> "jjjjj"
         println(colors.get("blue"))
         colors.keys.foreach{keyVal=> print("Key = " +keyVal) 
           print(" Value = " +colors(keyVal))}
      
         colors.keys.foreach{keyVal=>
           println(keyVal)
         }
      
 val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      
      println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
      println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))
      println(capitals.get( "France" ))
      
      
   }
   var factor = 3
   val multiplier = (i:Int, J: String) => i * factor+J
   

}