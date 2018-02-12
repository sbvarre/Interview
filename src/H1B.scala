import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by Varre.Sai-Bharath-Ku on 6/12/2017.
  */
object H1B {
  def main(args: Array[String]): Unit = {
    implicit def stringToDate(date: String) = new {
      def parse(implicit format: String) = parse0(date)(format)

      private def parse0(date: String)(implicit format: String) = {
        val sdf = new SimpleDateFormat(format)
        sdf.setLenient(false)
        sdf.parse(date)
      }

      def isValid(implicit format: String) = try {
        parse0(date)(format); true
      } catch {
        case _ => false
      }

      def beforeNow(implicit format: String) = parse0(date)(format) before new Date()

      def afterNow(implicit format: String) = parse0(date)(format) after new Date()
    }
    implicit val format = "yyyyMMdd"

   val x = "AA-12345-12-55-A-26"



    def udfDWGGN(x: String) = {
      if(x!=null && x!="\u0000") {
        if ((x.length == 0 || x == "0")) {
          "Y"
        } else if (x.contains('-')) {
          val splitter = x.split("\\-")
          val (first, second) = (splitter(0), splitter(1))
          if (first.length == 2 && first.matches("[a-zA-Z]+") && second.length >= 5 && second.length <= 16 && second.matches("[+-]?\\d+.?\\d+")) "Y" else x
        } else "Y"
      } else "Y"
    }

    if(udfDWGGN(x)=="Y") println("yes") else println("no")

  }
}
