object Main extends App {
  val mainResource = Option(getClass.getResource("main-resource.txt"))
  val testResource = Option(getClass.getResource("test-resource.txt"))
  println(s"Main resource: $mainResource")
  println(s"Test resource: $testResource")
}
