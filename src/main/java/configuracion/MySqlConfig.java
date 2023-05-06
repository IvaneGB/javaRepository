package configuracion;

import java.sql.*;

public class MySqlConfig {

    String host = "";
    String user = "";
    String password = "";
    String bd = "";

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String database="develop";
        String user = "root";
        String password="i995507215";

        String url = "jdbc:mysql://localhost:3306/"+database+"?user="+user+"&password="+password;
        return DriverManager.getConnection(url);
    }

    public ResultSet getResulSet(CallableStatement callableStatement) throws SQLException {
        return callableStatement.executeQuery();
    }



}
