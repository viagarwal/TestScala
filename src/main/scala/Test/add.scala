package Test

object add {
   def addInt( a:Int, b:Int ) : Int ={
      var sum:Int = 0
      sum = a + b
//      print(sum)
      return sum;
     
   }
   def succ(x:Int)= x+1;
   def fact(x:Int): Int={
     if(x==0) 1 
     else 
       x*fact(x-1)
   }
   def main(args: Array[String]) {
       println(addInt(10, 12));
       println(succ(5));
       var x= List(1,2,3,4)
       var y= List(1,2,3,4)
       println(x :: y)
       println(x ::: y)
       println(x ++ y)
       println("List====="+x.:::(y))
       println(x(1))
       x = 5::x
       println(x)
       println(x.reverse)
       println("Sorted==="+x.sorted)
       var arr  = x.toArray;
       println(arr(0))
       println(arr(1))
       println("%%%%%%%%%%")
       println(x.slice(0, 2))
       println(x.length)
       println(x.size)
       println("****dropright*****")
       println(x)
       println(x.dropRight(2))
       println(3 ::x)
       println("drop****")
       println(x)
       println(x.drop(2))
       println("$$$$$$$$$$")
       println(x)
       println(x.indexOf(1))
       println("&&&&&&&&&&")
              println(x)
       println(x.head)
       println(x.tail)
       println(x.drop(2))
       
        val s= Set(1,2,3,4)
        println("*****")
        println(s.head)
        println(s.tail)
        println(s.slice(0, 2))
        println(s.size)
        println(s.toList.reverse)
        println(s.drop(2))
        println(s)
        println(s.+(5, 6, 7))
        println(s)
//        var ss = s += 5
//        println(ss)
   
   }
}