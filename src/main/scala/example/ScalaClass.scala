package example

class ScalaClass {
  def someMethod[T](implicit mf: Manifest[T]): Unit = {}
  someMethod[JavaClass[_]]
}