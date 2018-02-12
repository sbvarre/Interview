/**
  * Created by Varre.Sai-Bharath-Ku on 2/3/2017.
  */
object mapTest {
  def main(args: Array[String]): Unit = {
    val x = Map((1,"Varre"),(2,"Bharath"))
    val example = "vom eise befreit sind strom und baeche"
    val res = example.split("").zipWithIndex.map { case (row, rowNum) => rowNum + "," + row.mkString(",") }
    println("res..."+res)
  }
}
