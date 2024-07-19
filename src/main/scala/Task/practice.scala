package Task

object practice extends App{

  //Sliding
  val numbers = List(1, 2, 3, 4, 5)
  val strings = List("abc", "def", "ghi", "jkl", "lmn")
  val windows = numbers.sliding(3)
  windows.foreach(println)

  //Map
  val doubledNumbers = numbers.map(x => x * 2)
  doubledNumbers.foreach(println)

  //Filter
  val evenNumbers = numbers.filter(x => x % 2 == 0)
  evenNumbers.foreach(println)

  //Reduce
  val sum = numbers.reduce((x, y) => x + y)
  println("Sum: " + sum)

  //FoldLeft
  val sumLeft = numbers.foldLeft(0)(_ + _)
  println("Sum (foldLeft): " + sumLeft)

  //FoldRight
  val sumRight = numbers.foldRight(0)(_ + _)
  println("Sum (foldRight): " + sumRight)

  //Group By
  val groupedStrings = strings.groupBy(x => x.length)
  groupedStrings.foreach(println)

  val numbers2 = (1 to 1000000).view
  val evenNumbers1 = numbers2.filter(_ % 2 == 0)
  println(evenNumbers1.take(10).toList)
  // Output: List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

}
