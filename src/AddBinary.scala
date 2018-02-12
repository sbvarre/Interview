/**
  * Created by Varre.Sai-Bharath-Ku on 2/6/2018.
  */
object AddBinary {
  def addBinary(a: String, b: String): String = {
    val la = a.length
    val lb = b.length
    val max = Math.max(la, lb)
    val sum = new StringBuilder("")
    var carry = 0
    var i = 0
    for (i <- 0 until max by 1) {
        val m = getBit(a, la - i - 1)
        val n = getBit(b, lb - i - 1)
        val add = m + n + carry
        sum.append(add % 2)
        carry = add / 2
      }
      if (carry == 1) sum.append("1")
      sum.reverse.toString
    }


  def getBit(s: String, index: Int): Int = {
    if (index < 0 || index >= s.length) return 0
    if (s.charAt(index) == '0') 0
    else 1
  }

}
