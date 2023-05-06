import configuracion.MySqlConfig;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public  static void main(String[] args) throws SQLException, ClassNotFoundException {
        callSPExample();
    }

    public  static void  callSPExample() throws SQLException, ClassNotFoundException {

        MySqlConfig config = new MySqlConfig();

        String sqlToCallSP = "{call insertar_datos(?,?,?)}";
        Connection connection = config.getConnection();

        CallableStatement callableStatement= connection.prepareCall(sqlToCallSP);
        callableStatement.setString(1,"huachipa");
        callableStatement.setString(2,"Chile");
        callableStatement.setString(3,"Amercia");

      /*  ResultSet rs = config.getResulSet(callableStatement);
        while (rs.next()){
            System.out.println(rs.getString(1)+" "+
                    rs.getString(2)+" "+
                    rs.getString(3));
        }*/
    }
    public  static void  callSPExample2() throws SQLException, ClassNotFoundException {

        MySqlConfig config = new MySqlConfig();

        String sqlToCallSP = "{call eliminar_dato(?)}";
        Connection connection = config.getConnection();

        CallableStatement callableStatement= connection.prepareCall(sqlToCallSP);
        callableStatement.setString(1,"Callao");



    }

}
