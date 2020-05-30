object Class5_Scala {

// ****************  Exercise 1 : In Class exercise -> Part 1  ****************

  def greet1(x: String): String = {
    var greet = "Hello " + x + " How U Doing?"
    return greet
  }                                               //> greet1: (x: String)String
  def greet2(x: String): String = {
    var greet = "Hello " + x + " How are you Doing?"
    return greet
  }                                               //> greet2: (x: String)String
  greet1("Alice")                                 //> res0: String = Hello Alice How U Doing?
  greet2("Nick")                                  //> res1: String = Hello Nick How are you Doing?

  def frame(x: String, f: String => String): String = {
    f(x)
  }                                               //> frame: (x: String, f: String => String)String
  //val result = frame("Arnab", greet1)
  //println(result);
  frame("Alice", greet1)                          //> res2: String = Hello Alice How U Doing?
  frame("Nick", greet2)                           //> res3: String = Hello Nick How are you Doing?
  
  
  // ****************  Exercise 1 : In Class exercise -> Part 2  ****************

  
  val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)      //> list  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val oddNums = list.filter((x: Int) => x % 2 != 0)
                                                  //> oddNums  : List[Int] = List(1, 3, 5, 7, 9)
  for (n <- oddNums) { println(n) }               //> 1
                                                  //| 3
                                                  //| 5
                                                  //| 7
                                                  //| 9

  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }                                               //> factorial: (n: Int)Int
  val factList = list.map(x => x).map(factorial)  //> factList  : List[Int] = List(1, 2, 6, 24, 120, 720, 5040, 40320, 362880)
  for (n <- factList) { println(n) }              //> 1
                                                  //| 2
                                                  //| 6
                                                  //| 24
                                                  //| 120
                                                  //| 720
                                                  //| 5040
                                                  //| 40320
                                                  //| 362880
  
  val factListOdd = oddNums.map(x => x).map(factorial)
                                                  //> factListOdd  : List[Int] = List(1, 6, 120, 5040, 362880)
  for (n <- factListOdd) { println(n) }           //> 1
                                                  //| 6
                                                  //| 120
                                                  //| 5040
                                                  //| 362880
                                                  
                                                  
   
  
  // ****************  Exercise 2 : Part 1  ****************
  
  val nwelist = 1 to 45                           //> nwelist  : scala.collection.immutable.Range.Inclusive = Range 1 to 45
  
  val listDiv4 = nwelist.filter((x: Int) => x % 4 == 0)
                                                  //> listDiv4  : scala.collection.immutable.IndexedSeq[Int] = Vector(4, 8, 12, 1
                                                  //| 6, 20, 24, 28, 32, 36, 40, 44)
  val sumDiv4 = listDiv4.reduce( (x: Int, y: Int) => x + y)
                                                  //> sumDiv4  : Int = 264
  println(sumDiv4)                                //> 264
  
  
  
  // ****************  Exercise 2 : Part 2  ****************
  
  val listDiv3 = nwelist.filter((x: Int) => x % 3 == 0 && x<20)
                                                  //> listDiv3  : scala.collection.immutable.IndexedSeq[Int] = Vector(3, 6, 9, 12
                                                  //| , 15, 18)
  
  val sumDiv3 = listDiv3.reduce( (x: Int, y: Int) => x + y)
                                                  //> sumDiv3  : Int = 63
  println(sumDiv3)                                //> 63
  
  
  
  // ****************  Exercise 3 : Part 1  ****************
  
  def max(x1: Int, y1: Int): Int = {
    if (x1 > y1) x1 else y1
  }                                               //> max: (x1: Int, y1: Int)Int

  max(5, 6)                                       //> res4: Int = 6

  /*
  def get_max(x1: Int, y1: Int, f: (Int, Int) => Int): Int = {
    f(x1, y1)
  }
  get_max(4, 5, max)
  
  */
  
  
 
  
}
                                              