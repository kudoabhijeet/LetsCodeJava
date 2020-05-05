import java.sql.*;

public class Exp10_1 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/emp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    private static final String CREATE_TABLE_SQL="CREATE TABLE employees ("
            + "id INT NOT NULL,"
            + "age int NOT NULL,"
            + "first VARCHAR(255)  NOT NULL,"
            + "LAST VARCHAR(255)  NOT NULL"
            + ");";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();

            stmt.executeUpdate(CREATE_TABLE_SQL);

            System.out.println("Table created");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close connection
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}