/**
  * Created by Varre.Sai-Bharath-Ku on 2/6/2018.
  */
object RemoveDuplicates {
  def removeDuplicates(nums: Array[Int]): Int = {
    var i = 0
    for (n <- nums) {
      if (i < 2 || n > nums(i - 2)) nums({
        i += 1; i - 1
      }) = n
    }
    i
  }

}
