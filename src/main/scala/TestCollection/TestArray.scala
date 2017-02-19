package TestCollection


import Array._

object TestArray {
  
  
  
   def main(args: Array[String]) {
     
     var arr = Array(1,2,3,5)
     var arr1 =Array(6,7,8,5)
     println(arr(0))
     println(arr.length)
     println(arr.toList)
    var x = arr ++ arr1
    for(y<- x)
    {
     println(y) 
    }
      var myList1 = range(10, 20, 2)
     for(y<-myList1){
       println(y)
     }
   }
  
}