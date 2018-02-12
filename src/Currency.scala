

/**
  * Created by Varre.Sai-Bharath-Ku on 12/12/2016.
  */
object Currency {
  def main(args: Array[String]): Unit = {

    var sr = "-33632.24"
    val sub = sr.substring(1,sr.length)
    println("sub"+sub)
    val isDecimal = sr.contains('.')

    if(sr.length==0 ||  (!sr.contains('.') && sr.length >=2 && sr.length <=8 && sr.matches("[1-9][0-9]+"))
      || (!sr.contains('.') && sr.length ==1 && sr.matches("[0-9]+"))
      | (!sr.contains('.') && sr.contains('-')  && sr.length ==2 && sr.substring(1).matches("[0-9]+"))
      ||(!sr.contains('.')&& sr.contains('-') && ((sr.substring(1,sr.length)).length >=2 && (sr.substring(1,sr.length)).length <=8) && sr.matches("[1-9][0-9]")) ){
      println("Y")
    }
    else if(sr.contains('.') && !sr.contains("-")){
      val splitter = sr.split("\\.")
      val (first, second) = (splitter(0), splitter(1))
      if(first.length ==0 && second.matches("[0-9]+"))  println("y")
      else if (first.length<=1 && second.length >=1 && second.length <=2 && first.matches("[0-9]+") && second.matches("[0-9]+") ) println("y")
      else if (first.length >=2 && first.length <=8 && second.length >=1 && second.length <=2 && first.matches("[1-9][0-9]+") && second.matches("[0-9]+") ) println("y") else println("n")
    }


    else if(sr.contains('.') && sr.contains("-")) {
      val splitter = sr.substring(1,sr.length).split("\\.")

      val (first, second) = (splitter(0), splitter(1))
      println("first"+first)
      if (first.length == 0 && second.matches("[0-9]+")) println("y")
      else if (first.length <= 1 && second.length >= 1 && second.length <= 2 && first.matches("[0-9]+") && second.matches("[0-9]+")) println("y")
      else if (first.length >=2 && first.length <=8 && second.length <= 2 && first.matches("[1-9][0-9]+") && second.matches("[0-9]+")) println("y") else println("n")
    } else println("n")
  }}
