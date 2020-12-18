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
import models.Usuario;

/**
 *
 * @author kevin
 */
public class UsuarioDAOImpl extends BDGenericoDAO implements UsuarioDAO{
    private Connection connection = null;
    public UsuarioDAOImpl() throws SQLException,ClassNotFoundException{
        this.connection = getConnection();
    }

    @Override
    public Usuario login(String login, String senha) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "Select * from usuarios Where login = ? and LOWER(senha) = md5(LOWER(?))";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);

            rs = pstmt.executeQuery();//executeQuery porque retornar� apenas 1 dado

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setLogin(rs.getString("login"));
                usuario.setAdmin(Boolean.getBoolean( rs.getString("admin") ));
                usuario.setFuncionario(Boolean.getBoolean( rs.getString("funcionario") ));
                usuario.setDataCad(rs.getString("data_cad"));
                usuario.setDataUpdate(rs.getString("data_update"));
                return usuario;
                
            } else {
                return null;
            }

        } catch (Exception e) {
           e.printStackTrace();
           return null;
        } finally {
          //fechando objetos
           close(rs);
           close(pstmt);
           close(connection);
        }
    }

    @Override
    public void cadastraFuncionario(Usuario usuario) {
      PreparedStatement pstmt = null;

      try {
         String sql = "Insert into usuarios(login, senha, funcionario) values(?, ?, 1)";
         pstmt = connection.prepareStatement(sql);

         pstmt.setString(1, usuario.getLogin());
         pstmt.setString(2, usuario.getSenha());

         pstmt.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         close(pstmt);
         close(connection);
      }
    }

    @Override
    public void getFuncionarioById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listAllFuncionarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editaFuncionario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
