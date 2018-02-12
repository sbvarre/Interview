
/**
  * Created by Varre.Sai-Bharath-Ku on 12/12/2016.
  */
object Value {
  def main(args: Array[String]): Unit = {

   val nums = Array(0,1,0,3,12)
    var nums1=nums.filter(_!=0)
    def moveZeroes(nums: Array[Int]): Unit = {
      while (nums1.length < nums.length) {
        nums1 = nums1:+0
      }
      return nums1
    }

    moveZeroes(nums)
  }
}


