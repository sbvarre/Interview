/**
  * Created by Varre.Sai-Bharath-Ku on 12/12/2016.
  */
object Alpha {
  def main(args: Array[String]): Unit = {

    val sr = ""
    val er=""

    val s="[a12"
    val sub = s.substring(1,s.length)
    println("sub value===="+sub)

  /*  if (sr == "" || sr == "99999999999999") {
      println("y")
    } else if (sr.length > 0) {

      if (sr.substring(0, 2).matches("[a-zA-Z]+") && sr.substring(2, 7).matches("[0-9]+") && sr.substring(7, 9).matches("[0-9]+") && sr.substring(9, 11).matches("[0-9]+") && sr.substring(11, 12).matches("[a-zA-Z]+") && sr.substring(12, 14).matches("[0-9]+")) {
        println("y")
      } else println("n")
    } else println("n")
*/
    println("Lenght=="+er.length)
    if (er == "") {
      println("y")
    } else if (er.length >= 7 && er.length<=18) {

      if (er.substring(0, 2).matches("[a-zA-Z]+") && er.substring(2, er.length).matches("[0-9]+")) {
        println("y")
      } else println("n")
    } else println("n")
  }
}