import java.sql.{Connection, DriverManager}

/**
  * Created by Varre.Sai-Bharath-Ku on 2/13/2017.
  */
object JdbcTest {
  def main(args: Array[String]): Unit = {
    val url = "jdbc:mysql://localhost:8889/mysql"
    val driver = "com.mysql.jdbc.Driver"
    val username = "root"
    val password = "root"
    var connection:Connection = null
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement()
      val dbcreate = statement.executeQuery("create database test")

    } catch {
      case e: Exception => e.printStackTrace
    }
    connection.close
  }
}