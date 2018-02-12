

/**
  * Created by Varre.Sai-Bharath-Ku on 2/7/2018.
  */
object HammingDistance {
  def main(args: Array[String]): Unit = {

    def wordCount(s: String){
    val data = s.split(",")
    val wordCount = scala.collection.mutable.HashMap[String, Int]().withDefaultValue(0)
   val x = data.foreach(word => wordCount(word) += 1)
  }
   val n = wordCount("hello how are you")

  }
}
