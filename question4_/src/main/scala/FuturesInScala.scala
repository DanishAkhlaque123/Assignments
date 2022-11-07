import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}
object FuturesInScala extends App{
  val function1 = Future {
    1
  }
  val function2 = Future {
    2
  }
  val result = for {
    v1 <- function1
    v2 <- function2
  } yield (v1+v2)

  result.onComplete{
    case Success(x) => println(s"result = $x")
    case Failure(e) => e.printStackTrace
  }
}
