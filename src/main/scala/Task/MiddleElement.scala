package Task

object MiddleElement extends App{
  def middle[T](list: List[T]): Option[T] = {
    val size = list.foldLeft(0)((acc, _) => acc + 1)
    val middleIndex = if (size % 2 == 0) size / 2 - 1 else size / 2

    list.zipWithIndex.foldLeft(None: Option[T]) {
      case (None, (elem, index)) if index == middleIndex => Some(elem)
      case (acc, _) => acc
    }
  }

  println(middle(List(1, 4, 3, 2, 5)))
  println(middle(List(1, 2, 3, 4, 5, 6)))
  println(middle(List(1)))
  println(middle(List()))
}
