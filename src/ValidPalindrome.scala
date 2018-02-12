/**
  * Created by Varre.Sai-Bharath-Ku on 2/6/2018.
  */
object ValidPalindrome {
  def main(args: Array[String]): Unit = {

    def canMakePalindrome(s: String) = canMakePalindrome1(s.toCharArray, 0, s.length - 1, 2)

     def canMakePalindrome1(chars: Array[Char], left: Int, right: Int, n: Int): Boolean

    =
    {
      if (left >= right) return true
      else if (chars(left) == chars(right)) return canMakePalindrome1(chars, left + 1, right - 1, n)
      else if (n == 0) return false
      else return canMakePalindrome1(chars, left + 1, right, n - 1) || canMakePalindrome1(chars, left, right - 1, n - 1)
    }

    canMakePalindrome("abca")
  }
}
