package TestCollection

object TestSet {
  
  
  
  
  def main(args: Array[String]) {
    var s = Set(1,2,3,4,5)
    var s11 = Set(6,7,8,9,10)
    println(s.filter { x => x>2})
    println(s.++(s11))
    println(s ++ s11)
    
   s = s.+(6, 7, 8)
   println(s)
   var s1 = Set(1,2,3)
   println(s ++s1)
   println(s.head)
   println(s.tail)
   println(s.min)
   println(s.max)
   println(s)
   println(s.maxBy { x => x>5})
    println(s.minBy { x => x<5})
    println(s.drop(2))
    println(s.dropRight(2))
    println(s.take(2))
    println(s.takeRight(2))
    println(s.size)
    println(s.count { x => x>3 })
    println(s(0))
    println(s.slice(0, 2))
    println(s.toList.reverse.toSet)
    println(s.toList.sorted.toSet)
    println(s.-(1,2,3))
    println(s.sum)
    println(s.map { x => x*2 })
    println(s)
    var s2 = Set(10,20)
    println(s.map ( x => x ->f(x) ).toMap)
    println(s2.flatMap { x => g(x) })
    println(s(0))
    

    
    
  }
  
  def f(i :Int) = ""+i+i
  
  
   def g(x :Int)= Set(x-1,x, x+1)
}