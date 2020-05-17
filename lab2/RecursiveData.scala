

sealed trait List[A]
case class Cons[A](head: A, tail: List[A]) extends List[A]
case class Nil[A]() extends List[A]

/** Напишите свои решения в виде функций. */
object RecursiveData {

  // a) Реализуйте функцию, определяющую является ли пустым `List[Int]`.

  def emp(list: List[Int]): Boolean = list match {
    case Nil() => true
    case _ => false
  }

  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntEmpty(list: List[Int]): Boolean = emp(list)

  // b) Реализуйте функцию, которая получает head `List[Int]`или возвращает -1 в случае если он пустой.

  def sl(list: List[Int]): Int = list match {
    case Cons(head,tail) => head
    case Nil() => -1
  }


  // используйте функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testListIntHead(list: List[Int]): Int = sl(list)

  // c) Можно ли изменить `List[A]` так чтобы гарантировать что он не является пустым?
  // Можно, путем добавления head в Nil()



}
