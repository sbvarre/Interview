

/**
  * Created by Varre.Sai-Bharath-Ku on 2/11/2018.
  */
object Median {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    val med = arr.sortWith(_ < _).drop(arr.length / 2).head
    println(+med)
  }
}
