import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object WordCount {
  
 def main(args: Array[String]) {
   
  Logger.getLogger("org").setLevel(Level.ERROR)
  val conf = new SparkConf().setMaster("local[*]").setAppName("WordCount").set("spark.driver.host", "localhost");
  val sc = new SparkContext(conf) 
  val input = sc.textFile("TheHungerGames.txt")
  val words = input.flatMap(x => x.split(" "))
  val wordCounts = words.countByValue()
  wordCounts.foreach(println)
 }
 
}