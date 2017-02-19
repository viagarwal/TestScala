package TestCollection


import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

import scala.io.Source

object Exceptions {
  
  
  
  def main(args: Array[String]) {
      try {
        for (line <- Source.fromFile("C:/Users/nim/Downloads/ScalaWorkSpace/TestScala/src/main/resources/input.txt").getLines()) {
            println(line)
          }
      } catch {
         case a: FileNotFoundException =>{
            println("Missing file exception")
         }
         
         case b: IOException => {
            println("IO Exception")
         }
      }
   }
  
  
}