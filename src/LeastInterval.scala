/**
  * Created by Varre.Sai-Bharath-Ku on 2/6/2018.
  */
object LeastInterval {

  import java.util

    def leastInterval(tasks: Array[Char], n: Int): Int = {
      val c = new Array[Int](26)
      for (t <- tasks) {
        c(t - 'A') += 1
      }
      util.Arrays.sort(c)
      var i = 25
      while ( {i >= 0 && c(i) == c(25)}) {
        i -= 1; i + 1
      }
      Math.max(tasks.length, (c(25) - 1) * (n + 1) + 25 - i)
    }

}
