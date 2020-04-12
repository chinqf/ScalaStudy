package basic

object CaseClass {
  def main(args: Array[String]): Unit = {
    // 样例类自动包含了apply方法
    val stu = Student("zs", 34)
    println(s"${stu.name} ${stu.age}")   // 样例类的变量默认为可外部访问的,但是不能修改(默认为val，除非修改成var)

    // 样例类默认提供 unapply 方法
    val Student(name, age) = stu
    println(s"$name $age")

    // 密封类模仿枚举值（）
    val color: TrafficColor = Red
    color match {
      case Green => println("可以通过")
      case Yellow => println("请快速通过")
      case Red => println("请止步")
      case _ => println("unknown")
    }



  }
}

case class Student(name: String, age: Int)

sealed abstract class TrafficColor    // 密封类的所有子类必须和密封类在同一个文件中
case object Green extends TrafficColor
case object Red extends TrafficColor
case object Yellow extends TrafficColor

