import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class DataBase {
    public static void main(String[] args) {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("user1");
        ds.setPassword("Thuhuong01");
        ds.setServerName("LAPTOP-OGIL9U3L\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("");


        try (Connection conn = ds.getConnection()) {
            System.out.println("Connect success");
            System.out.println(conn.MetaData());
        } catch (SQLServerException throwable) {
            throwable.printStackTrace();
        }catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}