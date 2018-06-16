package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
    Connection conn;
    public Connection ConnectionDB() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        //D:\University reports\Graduation project\Visualizer\
        conn = DriverManager.getConnection("jdbc:sqlite:trade.s3db");
        return  conn;
    }

}
