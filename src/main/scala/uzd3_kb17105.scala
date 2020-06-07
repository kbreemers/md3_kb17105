import scala.io._
import scala.collection.mutable.ListBuffer

object uzd3_kb17105 extends App {
  var line_in: String = _
  var inputs = new ListBuffer[Any]()

  println("Ievadi vardus (ievadi '0', kad velies partraukt ievadisanu):\n")
  while ({
    line_in = StdIn.readLine()
    line_in != "0"
  }) {
    val input_casted: Any = {
      if (line_in matches """\d+""") line_in.toInt else line_in
    }
    inputs += input_casted
  }
  println(inputs.distinct)
}
