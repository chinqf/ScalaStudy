package chinqf.basepractice.类和对象

object TestPrivate01 {
//  def main(args: Array[String]): Unit = {
//    val t = TestPri("A", "B")
//    t.func()
//  }
}

private[this] class TestPri(a: String, b: String) {
  def func(): Unit = {
    println("hello")
  } 
}


object TestPri {
//  def apply(a: String, b: String): TestPri = {
//    new TestPri(a, b)
//  }
//  def main(args: Array[String]): Unit = {
//    val t = new TestPri("A", "B")
//    t.func()
//  }
}



