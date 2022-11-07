import scala.util.Success

object Retry extends App{

  def retry1[T](n: Int)(f: => T): T = {
    try {
      f
    }
    catch {
      case e => if(n>1) retry1(n-1)(f)
      else throw e
    }
  }

    def fun: Unit = {
      println("hello there!")
    }

    println(retry1(5)(fun))

}
