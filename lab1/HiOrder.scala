package demo

class HiOrder {

  val plus: (Int, Int) => Int = _ + _
  val multiply: (Int, Int) => Int = _ * _
  //а)
  def nRaz(f: (Int, Int) => Int, a: Int, b: Int, n: Int): Int = n*f(a,b)
  //сигнатура не изменена
  def testNRaz(f: (Int, Int) => Int, a: Int, b: Int, n: Int): Int = nRaz(f, a, b, n)
  //б)
  def t = (a: Int, b: Int) => if (a > b) a else b
  def testAnonymousNTimes(a: Int, b: Int, n: Int): Int = t(a, b)

}
