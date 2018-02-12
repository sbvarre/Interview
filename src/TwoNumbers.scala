/**
  * Created by Varre.Sai-Bharath-Ku on 2/7/2018.
  */
object TwoNumbers {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var i = 0
    for (i <- 0 until nums.length by 1) {
     for (j <- i+1 until nums.length by 1) {
        if (nums(j) == target - nums(i)) return Array[Int](i, j)
      }
    }
    throw new IllegalArgumentException("No two sum solution")
  }
}
