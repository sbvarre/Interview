package gov.dol.edrvs.scala_example

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date

/**
  * @author ${user.name}
  */
object Datemonth {



  def main(args: Array[String]) {

    implicit def stringToDate(date: String) = new {
      def parse(implicit format: String) = parse0(date)(format)
      private def parse0(date: String)(implicit format: String) = {
        val sdf = new SimpleDateFormat(format)
        sdf.setLenient(false)
        sdf.parse(date)
      }
      def isValid(implicit format: String) = try {
        parse0(date)(format); true
      } catch {
        case _ => false
      }

      def beforeNow(implicit format: String) = parse0(date)(format) before new Date()
      def afterNow(implicit format: String) = parse0(date)(format) after new Date()
      def equalNow(implicit format: String) = parse0(date)(format) equals new Date()
    }
    implicit val format = "yyyyMMdd"
    val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
    //1800 Type of Recognized Credential (WIOA)
    val TypeOfRecognizedCredentialWIOA="1"
    val DateOfProgramExitWIOA="72011101"
    val ReceivedTrainingWIOA="1"
    val reportDueDate="20170801"
      val trcList = List("0","1","2","3","4","5","6","7","8")

        if(DateOfProgramExitWIOA.isValid==true){
          val lowerlimit="20140101"
          val upperlimit="20260630"
          val oldDate1 = LocalDate.parse(DateOfProgramExitWIOA, formatter)
          val newDate1 = LocalDate.parse(lowerlimit, formatter)

          val oldDate2 = LocalDate.parse(upperlimit, formatter)
          val newDate2 = LocalDate.parse(DateOfProgramExitWIOA, formatter)
          if(oldDate1.isAfter(newDate1) && newDate2.isBefore(oldDate2)){
            val add4qtrs = add4q(DateOfProgramExitWIOA)
            val oldDate = LocalDate.parse(add4qtrs, formatter)
            val newDate = LocalDate.parse(reportDueDate, formatter)
            if(newDate.isAfter(oldDate) && ReceivedTrainingWIOA=="1")
            {
              if (trcList.contains(TypeOfRecognizedCredentialWIOA)) println("yes") else println("no")
            } else println("yes")
          } else println("yes")
        } else println("yes")



    def add4q(x: String): String = x match {
      case x if	x.toInt>=	20140101	&&	x.toInt<=	20140331	=>"20150331"
      case x if	x.toInt>=	20140401	&&	x.toInt<=	20140630	=>"20150630"
      case x if	x.toInt>=	20140701	&&	x.toInt<=	20140930	=>"20150930"
      case x if	x.toInt>=	20141001	&&	x.toInt<=	20141231	=>"20151231"
      case x if	x.toInt>=	20150101	&&	x.toInt<=	20150331	=>"20160331"
      case x if	x.toInt>=	20150401	&&	x.toInt<=	20150630	=>"20160630"
      case x if	x.toInt>=	20150701	&&	x.toInt<=	20150930	=>"20160930"
      case x if	x.toInt>=	20151001	&&	x.toInt<=	20151231	=>"20161231"
      case x if	x.toInt>=	20160101	&&	x.toInt<=	20160331	=>"20170331"
      case x if	x.toInt>=	20160401	&&	x.toInt<=	20160630	=>"20170630"
      case x if	x.toInt>=	20160701	&&	x.toInt<=	20160930	=>"20170930"
      case x if	x.toInt>=	20161001	&&	x.toInt<=	20161231	=>"20171231"
      case x if	x.toInt>=	20170101	&&	x.toInt<=	20170331	=>"20180331"
      case x if	x.toInt>=	20170401	&&	x.toInt<=	20170630	=>"20180630"
      case x if	x.toInt>=	20170701	&&	x.toInt<=	20170930	=>"20180930"
      case x if	x.toInt>=	20171001	&&	x.toInt<=	20171231	=>"20181231"
      case x if	x.toInt>=	20180101	&&	x.toInt<=	20180331	=>"20190331"
      case x if	x.toInt>=	20180401	&&	x.toInt<=	20180630	=>"20190630"
      case x if	x.toInt>=	20180701	&&	x.toInt<=	20180930	=>"20190930"
      case x if	x.toInt>=	20181001	&&	x.toInt<=	20181231	=>"20191231"
      case x if	x.toInt>=	20190101	&&	x.toInt<=	20190331	=>"20200331"
      case x if	x.toInt>=	20190401	&&	x.toInt<=	20190630	=>"20200630"
      case x if	x.toInt>=	20190701	&&	x.toInt<=	20190930	=>"20200930"
      case x if	x.toInt>=	20191001	&&	x.toInt<=	20191231	=>"20201231"
      case x if	x.toInt>=	20200101	&&	x.toInt<=	20200331	=>"20210331"
      case x if	x.toInt>=	20200401	&&	x.toInt<=	20200630	=>"20210630"
      case x if	x.toInt>=	20200701	&&	x.toInt<=	20200930	=>"20210930"
      case x if	x.toInt>=	20201001	&&	x.toInt<=	20201231	=>"20211231"
      case x if	x.toInt>=	20210101	&&	x.toInt<=	20210331	=>"20220331"
      case x if	x.toInt>=	20210401	&&	x.toInt<=	20210630	=>"20220630"
      case x if	x.toInt>=	20210701	&&	x.toInt<=	20210930	=>"20220930"
      case x if	x.toInt>=	20211001	&&	x.toInt<=	20211231	=>"20221231"
      case x if	x.toInt>=	20220101	&&	x.toInt<=	20220331	=>"20230331"
      case x if	x.toInt>=	20220401	&&	x.toInt<=	20220630	=>"20230630"
      case x if	x.toInt>=	20220701	&&	x.toInt<=	20220930	=>"20230930"
      case x if	x.toInt>=	20221001	&&	x.toInt<=	20221231	=>"20231231"
      case x if	x.toInt>=	20230101	&&	x.toInt<=	20230331	=>"20240331"
      case x if	x.toInt>=	20230401	&&	x.toInt<=	20230630	=>"20240630"
      case x if	x.toInt>=	20230701	&&	x.toInt<=	20230930	=>"20240930"
      case x if	x.toInt>=	20231001	&&	x.toInt<=	20231231	=>"20241231"
      case x if	x.toInt>=	20240101	&&	x.toInt<=	20240331	=>"20250331"
      case x if	x.toInt>=	20240401	&&	x.toInt<=	20240630	=>"20250630"
      case x if	x.toInt>=	20240701	&&	x.toInt<=	20240930	=>"20250930"
      case x if	x.toInt>=	20241001	&&	x.toInt<=	20241231	=>"20251231"
      case x if	x.toInt>=	20250101	&&	x.toInt<=	20250331	=>"20260331"
      case x if	x.toInt>=	20250401	&&	x.toInt<=	20250630	=>"20260630"
      case x if	x.toInt>=	20250701	&&	x.toInt<=	20250930	=>"20260930"
      case x if	x.toInt>=	20251001	&&	x.toInt<=	20251231	=>"20261231"
      case x if	x.toInt>=	20260101	&&	x.toInt<=	20260331	=>"20270331"
      case x if	x.toInt>=	20260401	&&	x.toInt<=	20260630	=>"20270630"



    }



   

}

}
