/**
  * Created by Varre.Sai-Bharath-Ku on 2/11/2018.
  */
object ipaddress {

  private def isIpV4(ip: String): Boolean = {
    if (ip == null || ip.isEmpty) return false
    val splits = ip.split("\\\\.", -1)
    if (splits.length != 4) return false
    var i = 0
    for (i <- 0 to 4 by 1) {

        try {
          val `val` = Integer.parseInt(splits(i), 10)
          if (`val` < 0 || `val` > (1 << 8) - 1) return false
        } catch {
          case e: Exception =>
            return false
        }
        if (splits(i).charAt(0) == '-' || splits(i).charAt(0) == '+') return false
        if (splits(i).charAt(0) == '0' && splits(i).length > 1) return false
    }
    return true

  }
}
