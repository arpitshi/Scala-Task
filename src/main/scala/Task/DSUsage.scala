package Task
import scala.collection.mutable

trait Test {
  def Initialize(array: Array[Char]): Unit
  def FindOccurrence(input: Char): Int
  def FindLetter(input: Int): Char
}

class TestImpl extends Test {
  private val charToCount = mutable.Map[Char, Int]()
  private val indexToChar = mutable.Map[Int, Char]()

  def Initialize(array: Array[Char]): Unit = {
    array.zipWithIndex.foreach {
      case (char, index) =>
      charToCount.update(char, charToCount.getOrElse(char, 0) + 1)
      indexToChar.update(index, char)
    }
  }

  def FindOccurrence(input: Char): Int = {
    charToCount.getOrElse(input, 0)
  }

  def FindLetter(input: Int): Char = {
    indexToChar.getOrElse(input, 0)
  }
}

object DSUsage extends App{
  val test = new TestImpl
  val arr = Array('a', 'b', 'c', 'a', 'b', 'c', 'a')

  test.Initialize(arr)

  println(test.FindOccurrence('a'))
  println(test.FindOccurrence('b'))
  println(test.FindOccurrence('c'))
  println(test.FindLetter(0))
  println(test.FindLetter(1))
  println(test.FindLetter(6))
}

