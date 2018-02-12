

/**
  * Created by Varre.Sai-Bharath-Ku on 3/16/2017.
  */
object Datetest {
  def main(args: Array[String]): Unit = {
    /*
   /******************Validating ip***************************/
     val ip: String =
    "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "" +
      "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
    var p1:Pattern=Pattern.compile(ip)
  val x = "26.3.128.12"
    val m10:Matcher = p1.matcher(x);

    if(m10.matches()) println("yes") else println("no")


/******************Duplicate Elements***************************/
    val y = Array(1,1,2,3,3,4)
   val rever= y.reverse.toList

    val sort = y.sortWith(_ < _)
    println("first element"+sort.mkString(","))
    val dist = y.distinct
    val dup = y.diff(y.distinct).distinct.mkString(",")

    val unique = unique(y)
    println("Duplicate elements=>"+unique)


    /******************Number of words in a string***************************/

    val s = "hello hello how are you"
    val c = s.split(" ").size
    println("show"+c)

    val diswrods = s.split(" ").distinct.mkString(",")
    println("Distinct words=>"+diswrods)

    val counts =  s.split(" ").map(word => (word, 1)).groupBy(i=>i).mapValues(_.size).mkString(",")
    println("Occurences"+counts)


    val a1 = Array(1,2,3)
    val a2 = a1.map(_*3).mkString(",")
    val a3 = a2.filter(_%2!=0).mkString(",")
    val a4=a1.reverse.mkString(",")
    println(a4)

    case class Coord(x: Double, y: Double) {
      def dist(c: Coord) = Math.sqrt(Math.pow(x - c.x, 2) + Math.pow(y - c.y, 2))
    }
    class CoordOrdering(x: Coord) extends Ordering[Coord] {
      def compare(a: Coord, b: Coord) = a.dist(x) compare b.dist(x)
    }
    def top[T](xs: Seq[T], n: Int)(implicit ord: Ordering[T]): Seq[T] = {
      // xs is an ordered sequence of n elements. insert returns xs with e inserted
      // if it is less than anything currently in the sequence (and in that case,
      // the last element is dropped) otherwise returns an unmodifed sequence

      def insert[T](xs: Seq[T], e: T)(implicit ord: Ordering[T]): Seq[T] = {
        val (l, r) = xs.span(x => ord.lt(x, e))
        (l ++ (e +: r)).take(n)
      }
      xs.drop(n).foldLeft(xs.take(n).sorted)(insert)
    }
    val grid = (1 to 250000).map { _ => Coord(Math.random * 5, Math.random * 5) }
    val f = Coord(Math.random * 5, Math.random * 5)
   val nearest= top(grid, 3)(new CoordOrdering(f)).take(3)
    println(nearest)
*/ /*
    def nonDup(x: Array[Int]) = {
      val nonDup = x.distinct.diff(x.diff(x.distinct)).mkString(",")
      println("Non Duplicate Element=>" + nonDup)
    }

    /** ***************************Non Duplicate ************************/
    val x = Array(1, 1, 2, 3, 3, 4, 3, 4)

    /*  println("Value x =>"+x.mkString(","))
    val y = x.distinct
    println("Value y =>"+y.mkString(","))
    val z =x.diff(y)
    println("Value z =>"+z.mkString(","))*/

    val z1 = x.distinct.diff(x.diff(x.distinct))
    println("Value z1 =>" + z1.mkString(","))
    /** ***************************Reverse of a string ************************/
    val s = "hello"

    def revString(x: String): String = {
      (for (i <- s.length - 1 to 0 by -1) yield s(i)).mkString
    }

    /** ***************************Median of Arrays ************************/

    val l1 = Array(1, 2)
    val l2 = Array(3, 4)
    val l3 = l1 ++ l2
    if (l1.length % 2 == 0 && l2.length % 2 == 0) {
      val median1: Double = l1.sortWith(_ < _).drop(l1.length / 2).head
      println("First median=>" + median1)
      val median2: Double = l2.sortWith(_ > _).drop(l2.length / 2).head
      println("Second median=>" + median2)
      val m0: Double = (median1 + median2) / 2
      println("Median=>" + m0)
    } else {
      val median: Double = l3.sortWith(_ > _).drop(l3.length / 2).head
      println("Median for Odd Total=>" + median)
    }

    /** ***************************Difference in Bits value based on position ************************/
    def toBinary(i: Int, digits: Int = 4) =
      String.format("%" + digits + "s", i.toBinaryString).replace(' ', '0')

    val a = toBinary(8).toArray
    val b = toBinary(4).toArray
    println("Binary=>" + a.mkString(","))
    println("Binary=>" + b.mkString(","))


    val c = a.zip(b).filter(x => x._1 != x._2).size
    println("Number=>" + c)
    /** ********************************************************************************************/

    /** ***************************Palindrome *******************************************************/
    val x1 = 323
    val y1 = x1.toString.reverse.toInt

    if (x1 == y1) println("yes") else println("no")
    /** *******************************************************************************************/
    val s1 = "abcbc"
    val s2 = s1.toCharArray


    val s3 = s2.distinct
    val s4 = s1.diff(s3)
    println("S3===>" + s4.mkString(","))

    /** ***************************Longest Substring Without Repeating Characters *******************************************************/
    def lengthOfLongestSubstring(s: String) = {
      var i = 0;
      var j = 0;
      var max = 0
      val set = new mutable.HashSet[Char]()
      while ( {
        j < s.length
      })
        if (!set.contains(s.charAt(j))) {
          set.add(s.charAt({
            j += 1;
            j - 1
          }))
          max = Math.max(max, set.size)
        }
        else set.remove(s.charAt({
          i += 1;
          i - 1
        }))
      println("Max=>" + max)
    }

    lengthOfLongestSubstring("abdaa")
    /** ***************************Longest Substring Without Repeating Characters *******************************************************/


    /** ****************************Add Digits *************************************************************************************/

    val num1 = 1458878978
    var sum5 = num1.toString.map {
      _.asDigit
    }.foldLeft(0) {
      _ + _
    }
    while (sum5 >= 10) {
      sum5 = sum5.toString.map {
        _.asDigit
      }.foldLeft(0) {
        _ + _
      }
    }
    println("Total sum" + sum5)


    /** *********************************************************Reverse of Number ****************************************/

    val s10 = 123

    def reverseInt(x: Int): Int = {
      def reverset(x: Int, acc: Int = 0): Int = {
        if (x == 0)
          acc
        else {
          if (Math.abs(Int.MaxValue / 10) < Math.abs(acc)) 0 else
            reverset(x / 10, acc * 10 + (x % 10))
        }
      }

      reverset(x)
    }

    val returnInteger = reverseInt(1456)
    println("Reverse Int==>" + returnInteger)



*/
    def isValid(s: String): Boolean = {
      var brsA = s.toArray
      var hd:Boolean = false

      if(brsA.size !=4 && brsA.size !=1 && brsA.size%2==0){
        val odd = brsA.zipWithIndex.filter(_._2 % 2 != 1).map(_._1)
        val even = brsA.zipWithIndex.filter(_._2 % 2 == 1).map(_._1)
        for (i <- 0 until odd.size by 1) {
          (odd(i), even(i)) match {
            case ('(', ')') =>  hd=true
            case ('[', ']') =>  hd=true
            case ('{', '}') =>  hd=true
            case (_, _) =>   hd=false
          }
        }
        return hd
      } else if(brsA.size!=1 && brsA.size==4 && brsA.size%2==0 && brsA(0)==brsA(2) && brsA(1)==brsA(3)) {
        val odd = brsA.zipWithIndex.filter(_._2 % 2 != 1).map(_._1)
        val even = brsA.zipWithIndex.filter(_._2 % 2 == 1).map(_._1)
        for (i <- 0 to odd.size-1 by 1) {
          (odd(i), even(i)) match {
            case ('(', ')') => hd = false
            case ('[', ']') => hd = false
            case ('{', '}') => hd = false
            case (')', ')') => hd = false
            case (']', ']') => hd = false
            case ('}', '}') => hd = false
            case (_, _) => hd = true
          }
        }
        return hd
      }
      else return hd
    }


    val res = isValid("([)]")
println("Result"+res)

    class ListNode(var _x: Int = 0) {
      var next: ListNode = null
      var x: Int = _x
    }


  }
}




