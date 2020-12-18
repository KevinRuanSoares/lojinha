/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import models.Clientes;
import models.Usuario;
/**
 *
 * @author vinit
 */
public class ClienteDAOImp extends BDGenericoDAO implements ClienteDAO {
    private Connection connection = null;
        public ClienteDAOImp() throws SQLException,ClassNotFoundException{
        this.connection = getConnection();
    }
 
    @Override
    public void cadastra_cliente(Clientes nome) {
        PreparedStatement pstmt = null;
        
        try {
            String sql = "INSERT INTO clientes(nome) VALUES(?)";
            pstmt = connection.prepareStatement(sql);
                        
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(connection);
        }
    }
   
    @Override
    public void edita_cliente(Clientes nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getCliById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Clientes> listAllClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}