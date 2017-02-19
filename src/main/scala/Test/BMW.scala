package Test



class Point(xc: Int, yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move( dx: Int,dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}





object Demo {
  
  var x = (y:Int)=> y+1;
   def main(args: Array[String]) {
//      var pt: Point = new Point(10, 20);
     println(x(100));
      var pt = new Point(10,20)

      // Move to a new location
      pt.move(10, 10);
      
      pt = new Point(10,20);
      pt.move(10, 10)
      
//      val (myVar1: Int, myVar2: String) = Tuple2(40, "Foo")
//      println(myVar1);
   }
}