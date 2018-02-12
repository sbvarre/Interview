/**
  * Created by Varre.Sai-Bharath-Ku on 2/7/2018.
  */
object SortedArratDup {
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums.length == 0) return 0
    var i = 0
    for(j <- 1 to nums.length by 1)
   {
      if (nums(j) != nums(i)) {
        i += 1
        nums(i) = nums(j)
      }
    }
    i + 1
  }
}
