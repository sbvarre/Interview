/**
  * Created by Varre.Sai-Bharath-Ku on 12/15/2016.
  */
object Drop {
  def main(args: Array[String]): Unit = {

    val A101 = "0,1"
    val A102 = "0,2"
   val drop1 = A101
    val drop2 = A102.drop(2)
    val zip = drop1.union(drop2)
  }
}