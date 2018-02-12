import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by Varre.Sai-Bharath-Ku on 12/9/2016.
  */
object Test {
  def main(args: Array[String]): Unit = {
    implicit def stringToDate(date: String) = new {
      def parse(implicit format: String) = parse0(date)(format)

      private def parse0(date: String)(implicit format: String) = {
        val sdf = new SimpleDateFormat(format)
        sdf.setLenient(false)
        sdf.parse(date)
      }

      def isValid(implicit format: String) = try {
        if(date.matches("[0-9]+") && date.length==8) {
          parse0(date)(format);
          true
        }
      } catch {
        case _ => false
      }

      def beforeNow(implicit format: String) = parse0(date)(format) before new Date()

      def afterNow(implicit format: String) = parse0(date)(format) after new Date()
    }
    implicit val format = "yyyyMMdd"

    def udfUF2(UserField2: String) = {
      if(UserField2!="\u0000" && UserField2!=null){
        if ((UserField2.length == 0 || UserField2.length <=75)  && !UserField2.contains('"')) "Y" else UserField2
      } else "Y"
    }
  val x = udfUF2("'")
    println("reuslt===>"+x)



  }

}