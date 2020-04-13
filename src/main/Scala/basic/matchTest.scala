package basic

object matchTest {
  def main(args: Array[String]): Unit = {
    // 匹配值 (case后面需要和a同类型)
    val a = -3.0
    val b = a match {
      case 1.0 => 1.0*10
      case 3.0 => 3.0*3.0
      case _ => 0
    }
    println(b)    // 9.0

    // 匹配类型
    val c: Any = "123"
    c match {
      case i: Int => println("Int")
      case s: String => println("String")
      case _ => println("unKnown")
    }

    // 匹配数组、列表、元组等
    val arr = Array("a", "b", "c")
    arr match {
      case Array("a", c) => println(c)
      case Array("a") => println("a")
      case Array("a", _*) => println("a...")
      case _ => println("unknown")
    }   // a...

    // 匹配样例类
    val stu: Stu = Student01("zs", 89)
    stu match {
      case Student01(_, age) => println(s"01年龄为$age")
      case Student02(_, age, _) => println(s"02年龄为$age")
      case _ => println("unknown")
    }   // 01年龄为89


    // 守卫
    a match {
      case 1.0 => println("1")
      case _ if a > 0 => println("正数")
      case _ => println("负数")
    }


  }
}


abstract class Stu
case class Student01(name: String, age: Int) extends Stu
case class Student02(name: String, age: Int, cls: String) extends Stu

