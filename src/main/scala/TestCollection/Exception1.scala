package TestCollection


import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import scala.io.Source
import scala.util.control.Exception._
import javax.sound.sampled.UnsupportedAudioFileException
//import scala.util

object Exception1 {
  
   def main(args: Array[String]) {
      for (line <- Source.fromFile("C:/Users/nim/Downloads/ScalaWorkSpace/TestScala/src/main/resources/input.txt").getLines()) {
          println(line)
      }
   }
   
   @throws(classOf[IOException])
   @throws(classOf[UnsupportedAudioFileException])
   def playSoundFileWithJavaAudio(){
     
   }
}