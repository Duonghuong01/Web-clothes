package context;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "LAPTOP-OGIL9U3L\\SQLEXPRESS";
    private final String dbName = "clothes";
    private final String portNumber = "1433";
    private final String instance="";//LEAVE  THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "user1";
    private final String password = "Thuhuong01";

    public static void main(String[] args) {
        try {
            System.out.println(new DBContext().getConnection());
        }catch (Exception e){

        }
    }

}
