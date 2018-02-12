import java.util.regex.{Matcher, Pattern}

/**
  * Created by Varre.Sai-Bharath-Ku on 1/6/2017.
  */
object CurrencyValid {
  def main(args: Array[String]): Unit = {
    val A1234 = "000000.00"

    val pattern1 = "[+-]?(?!(0))[0-9]{0,8}(?:\\.[0-9]{1,2})?"
    val pattern2 = "^[+-]?(?!(0))[0-9]{0,8}$"
    val pattern3 = ""
    val pattern4 = "(?:\\.[0-9]{1,2})?"
    val pattern5 = "[+-]?0(?:\\.[0-9]{0,2})?"
    val pattern6 = "[0]{0,8}(?:\\.[0-9]{1,2})?"
    val p1:Pattern=Pattern.compile(pattern1)
    val p2:Pattern=Pattern.compile(pattern2)
    val p3:Pattern=Pattern.compile(pattern3)
    val p4:Pattern=Pattern.compile(pattern4)
    val p5:Pattern=Pattern.compile(pattern5)
    val p6:Pattern=Pattern.compile(pattern6)

    val m1:Matcher = p1.matcher(A1234);
    val m2:Matcher = p2.matcher(A1234);
    val m3:Matcher = p3.matcher(A1234);
    val m4:Matcher = p4.matcher(A1234);
    val m5:Matcher = p5.matcher(A1234);
    val m6:Matcher = p6.matcher(A1234);


    if((m1.matches() || m2.matches() || m3.matches() || m4.matches() || m5.matches() || m6.matches()))  println("yes") else println("no")


  }}
