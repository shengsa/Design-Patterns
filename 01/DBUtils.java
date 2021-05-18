import java.sql.Connection;
public class DBUtils {
  private Connection connection;

  public Connection getConnection() {
    System.out.println("连接数据库");
    return connection;
  }
}
