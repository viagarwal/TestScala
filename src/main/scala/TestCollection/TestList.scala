package TestCollection

object TestList {
  
  
  def main(args: Array[String]) {
    
       var x= List(1,2,3,4,4)
       println(x.filter { x =>x>2 })
       var y= List(1,2,3,4)
       println(x :: y)
       println(x ::: y)
       println(x ++ y)
       println("List====="+x.:::(y))
       println("List1====="+x. ++((y)))
       
       println(x(1))
       var cc = x.map { x => x*2 }
       println(cc)
       println(x.+("7"))
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
       println(x)
       println(x.take(2))
       println(x.takeRight(2))
       println("$$$$$$$$$$$$$$$$")
       println(x.groupBy(s=>s))
       println(x.groupBy { y=>x})
       val list = List("a"->1,"b"->2,"c"->3)
       val map = list.toMap;
       println(map)
       println(x.groupBy { x => x}.mapValues { x => x.length })
       println(x.groupBy { s => s}.mapValues { x => x.length })
       println(x.groupBy(s=>s).mapValues(s=>x.length))
       println("vvvvvvvvvv")
       println(x.toSet)
       println(x.toString())
       println(x.map(x => g(x)))
       println(x.map { x => g(x)})
       println(x.flatMap { x => g(x)})
       println(x.sum)
       val fruits = List("apple", "banana", "orange")
       println(fruits.map { x => x.toUpperCase()})
       println(fruits.flatMap { x => x.toUpperCase() })
       println(fruits.flatMap { x => x.toUpperCase().toCharArray() })
       
       
  }
  
  def g(v: Int) = List(v-1, v, v+1)
  
  
}