class function {
  //площадь
  def circleArea(r: Double): Double = r * r * Math.PI
  //сигнатура не изменена
  def testCircle(r: Double): Double = circleArea(r)
  //карированная функция s прямоугольника
  def rectangleArea(a: Double)(b: Double): Double = a * b
  //сигнатура не изменена
  def testRectangleCurried(a: Double, b: Double): Double = rectangleArea(a)(b)
  //не кар функция s прямоугольника
  def rectangleArea(a: Double, b: Double): Double = a * b
  //сигнарутар не измен
  def testRectangleUc(a: Double, b: Double): Double = rectangleArea(a, b)

}
