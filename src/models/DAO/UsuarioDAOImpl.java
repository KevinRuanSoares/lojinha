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
import java.util.ArrayList;
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
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         close(pstmt);
         close(connection);
      }
    }

    @Override
    public void getFuncionarioByName(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listAllFuncionarios() {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Usuario> funcionarios = new ArrayList<>();
        try {
            String sql = "Select * from usuarios where funcionario = 1";
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Usuario funcionario = new Usuario();
                funcionario.setId(Integer.parseInt(rs.getString("id")));
                funcionario.setLogin(rs.getString("login"));
                funcionario.setAdmin(Boolean.getBoolean( rs.getString("admin") ));
                funcionario.setFuncionario(Boolean.getBoolean( rs.getString("funcionario") ));
                funcionario.setDataCad(rs.getString("data_cad"));
                funcionario.setDataUpdate(rs.getString("data_update"));
                funcionarios.add(funcionario);
            }

        } catch (Exception e) {
           e.printStackTrace();
        } finally {
          //fechando objetos
           close(rs);
           close(pstmt);
           close(connection);
        }
        return funcionarios;
    }

    @Override
    public void editaFuncionario(Usuario usuario) {
        PreparedStatement pstmt = null;

        try {
           String sql = "Update usuarios set login=?, senha=md5(?) where id = ?";
           pstmt = connection.prepareStatement(sql);

           pstmt.setString(1, usuario.getLogin());
           pstmt.setString(2, usuario.getSenha());
           pstmt.setString(3, String.valueOf(usuario.getId()));

           pstmt.executeUpdate();
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
           close(pstmt);
           close(connection);
        }
    }

    @Override
    public void excluirFuncionario(Usuario usuario) {
        PreparedStatement pstmt = null;

        try {
           String sql = "Delete from usuarios where id = ?";
           pstmt = connection.prepareStatement(sql);
           pstmt.setString(1, String.valueOf(usuario.getId()));

           pstmt.executeUpdate();
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
           close(pstmt);
           close(connection);
        }
    }
}
