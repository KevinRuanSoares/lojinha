package models.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BDGenericoDAO {


    protected Connection getConnection() throws SQLException{
        String urlJDBC = "jdbc:mysql://localhost:3305/loginha_prod";
        Connection connection = DriverManager.getConnection(urlJDBC, "root", "mymaruadb");
        return connection;
    }

   protected void close(ResultSet rs) {
        if (rs !=null) {
           try {
                rs.close();
           } catch (Exception e) {
                e.printStackTrace();
           }
        }
   }

   protected void close(PreparedStatement pstmt) {
      if (pstmt !=null) {
            try {
               pstmt.close();
            } catch (Exception e) {
               e.printStackTrace();
            }
      }
   }

   protected void close(Connection connection) {
        if (connection !=null) {
           try {
              connection.close();
           } catch (Exception e) {
              e.printStackTrace();
           }
        }
   }
}