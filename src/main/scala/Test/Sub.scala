package Test {


class Sub  extends Super{
  
  (new Super).f1();
  f1();
  
   def main(args: Array[String]) {
     
     
     (new Super).f1();
     f1()
     
   }
}  
 

object x extends Super with Test with Test2{
  
  f1();

  (new Super).f1();

}
}