import com.sun.corba.se.impl.naming.cosnaming.InternalBindingValue

/**
  * Created by Varre.Sai-Bharath-Ku on 11/15/2017.
  */ // for base64

object Test1 {
  def main(args: Array[String]): Unit = {
    val nums = Array(1, 0, 4, 0, 3)
    var filtered = nums.filter(_ != 0)
    println("size" + filtered.size)
    while (nums.size - filtered.size > 0) {
      filtered = filtered ++ Array(0)

    }
    println(filtered.mkString(","))

    def romanToInt(s: String) = {
      var sum = 0
      if (s.indexOf("IV") != -1) sum -= 2
      if (s.indexOf("IX") != -1) sum -= 2
      if (s.indexOf("XL") != -1) sum -= 20
      if (s.indexOf("XC") != -1) sum -= 20
      if (s.indexOf("CD") != -1) sum -= 200
      if (s.indexOf("CM") != -1) sum -= 200
      val c = s.toCharArray
      var count = 0

      while ( {
        count <= s.length - 1
      }) {
        if (c(count) == 'M') sum += 1000
        if (c(count) == 'D') sum += 500
        if (c(count) == 'C') sum += 100
        if (c(count) == 'L') sum += 50
        if (c(count) == 'X') sum += 10
        if (c(count) == 'V') sum += 5
        if (c(count) == 'I') sum += 1

        {
          count += 1;
          count - 1
        }
      }
      sum
    }

    romanToInt("XL")


    def maxProfit(prices: Array[Int]): Int = {
      if (prices == null || prices.length <= 1) return 0
      var min = prices(0)
      // min so far
      var result = 0
      var i = 1
      while ( {
        i < prices.length
      }) {
        result = Math.max(result, prices(i) - min)
        min = Math.min(min, prices(i))

        {
          i += 1;
          i - 1
        }
      }
      result
    }


    def addBinary(a: String, b: String): String = { // Start typing your Java solution below
      // DO NOT write main() function
      val la = a.length
      val lb = b.length
      val max = Math.max(la, lb)
      val sum = new StringBuilder("")
      var carry = 0
      var i = 0
      while ( {
        i < max
      }) {
        val m = getBit(a, la - i - 1)
        val n = getBit(b, lb - i - 1)
        val add = m + n + carry
        sum.append(add % 2)
        carry = add / 2

        {
          i += 1;
          i - 1
        }
      }
      if (carry == 1) sum.append("1")
      sum.reverse.toString
    }

    def getBit(s: String, index: Int): Int = {
      if (index < 0 || index >= s.length) return 0
      if (s.charAt(index) == '0') 0
      else 1
    }


    def moveZeroes(nums: Array[Int]): Unit = {
      val brr = new Array[Int](nums.length)
      var noZero = 0
      var z = 0
      while ( {
        z < nums.length
      }) {
        if (nums(z) != 0) {
          brr(noZero) = nums(z)
          noZero += 1
        }

        {
          z += 1;
          z - 1
        }
      }
      var z1 = noZero
      while ( {
        z1 < nums.length
      }) {
        brr(z1) = 0

        {
          z1 += 1;
          z1 - 1
        }
      }
      var z2 = 0
      while ( {
        z2 < nums.length
      }) {
        nums(z2) = brr(z2)

        {
          z2 += 1;
          z2 - 1
        }
      }
    }

    def moveZeroes1(nums: Array[Int]): Array[Int] = {
      var filtered = nums.filter(_!=0)
      while(nums.size-filtered.size>0 ){
        filtered=filtered ++ Array(0)
      }
      return filtered
    }
/*
    moveZeroes1(Array(1,0,3,0,12))

    import java.util
    import java.util.Comparator
    def minMeetingRooms(intervals: Array[Nothing]) = {
      if (intervals == null || intervals.length == 0) return 0
      util.Arrays.sort(intervals, new Comparator[Nothing]() {
        override def compare(i1: Nothing, i2: Nothing): Int = i1.start - i2.start
      })
      val queue = new Nothing
      var count = 1
      queue.offer(intervals(0).end)
      var i = 1
      while ( {
        i < intervals.length
      }) {
        if (intervals(i).start < queue.peek) count += 1
        else queue.poll
        queue.offer(intervals(i).end)

        {
          i += 1; i - 1
        }
      }
      count
    }
*/
  }
}


