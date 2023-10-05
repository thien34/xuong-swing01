package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {

    public static String HOSTNAME = "localhost";
    public static String PORT = "1433";
    public static String DBNAME = "S1_Nhom1";
    public static String USERNAME = "sa";
    public static String PASSWORD = "123456";
    public static String url = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";" + "databaseName=" + DBNAME + ";encrypt=true;trustServerCertificate=true";

    public static PreparedStatement preparedStatement(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        PreparedStatement ps = null;
        if (sql.trim().startsWith("{")) {
            ps = conn.prepareCall(sql);
        } else {
            ps = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        return ps;
    }

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement pstmt = preparedStatement(sql, args);
            try {
                return pstmt.executeQuery();
            } finally {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement pstmt = preparedStatement(sql, args);
            try {
                pstmt.executeUpdate();
            } finally {
                pstmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
