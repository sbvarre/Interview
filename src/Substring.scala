/**
  * Created by Varre.Sai-Bharath-Ku on 12/14/2016.
  */
object Substring {
  def main(args: Array[String]): Unit = {
    val x = "123a234"
    val st = x.substring(0,3)
    println("DIGITS"+st)

    if (x.length == 0) println("good")
    else if(x.length == 7) {
      if (x.substring(0, 3).matches("[a-zA-Z]+") && x.substring(3, 7).matches("[+-]?\\d+.?\\d+")) println("good") else println("bad")
    } else println("bad")
  }

  def isNumber(st:String):Boolean={
    if(st.matches("[+-]?\\d+.?\\d+")) true else false
  }
val y:String = "123"
   val z = isNumber(y)
  println("value"+z)
}
