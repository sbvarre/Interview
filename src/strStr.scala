/**
  * Created by Varre.Sai-Bharath-Ku on 2/6/2018.
  */
object strStr {
  def main(args: Array[String]): Unit = {

    def strStr(haystack: String, needle: String): Int = {
      val l1 = haystack.length
      val l2 = needle.length

      if (l1 < l2) return -1
      else if (l2 == 0) return 0
      val threshold = l1 - l2

      for (i <- 0 to threshold by 1) {
        if (haystack.substring(i, i + l2) == needle) return i
      }
      -1
    }
  }
}
