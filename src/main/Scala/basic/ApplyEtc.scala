package basic

object UpdateEtc {

  def main(args: Array[String]): Unit = {
    // apply
    val a01 = A("a", "b", "c")
    a01.run()   // run

    // update
    a01("beijing", 1) = "shanghai"   // 1. change beijing to shanghai
    A(1) = 2    // change number 1 to 2

    // unapply
//    val A(a) = a01
//    println(s"$a")    // a

    // unapplySeq()
    val A(f, s) = "first second"
    println(s"$f $s")


  }

}

class A(val a: String, var b: String, c: String) {
  def run(): Unit = {
    println("run")
  }

  def update(addr01:String, a:Int, addr02:String): Unit = {
    println(s"$a. change $addr01 to $addr02")
  }

  def updateSeq(arg: String): Option[Seq[String]] = {
    if (arg.split(" ").size == 0)
      None
    else
      Some(arg.split(" "))
  }

}

object A {
  def apply(a: String, b: String, c: String): A = {
    new A(a, b, c)
  }

  def update(int01: Int, int02: Int): Unit = {
    println(s"change number $int01 to $int02")
  }
  def unapplySeq(arg: String): Option[Seq[String]] = {
    val infoArr = arg.split(" ")
    if (infoArr.size == 0)
      None
    else
      Some(arg.split(" "))
  }
//
//  def unapply(arg: A): Option[(String)] = {
//    if (arg == null)
//      None
//    else
//      Some(arg.a)
//  }


}

