/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.SQLException;
import java.util.List;
import models.DAO.UsuarioDAO;
import models.DAO.UsuarioDAOImpl;
import models.Usuario;

/**
 *
 * @author kevin
 */
public class FuncionarioController {
    public static void inserir(String login, String senha) throws SQLException, ClassNotFoundException{
        Usuario funcionario = new Usuario();
        funcionario.setLogin(login);
        funcionario.setSenha(senha);
        UsuarioDAO dao = new UsuarioDAOImpl();
        try{
            dao.cadastraFuncionario(funcionario);
        } catch (Exception e) {
            throw new Error("Erro ao cadastrar funcionario" + e);
        }
        
    }
    public static void editar(Usuario funcionario) throws SQLException, ClassNotFoundException{
        UsuarioDAO dao = new UsuarioDAOImpl();
        try{
            dao.editaFuncionario(funcionario);
        } catch (Exception e) {
            throw new Error("Erro ao editar funcionario" + e);
        }
    }
    
    public static void excluir(Usuario funcionario) throws SQLException, ClassNotFoundException{
        UsuarioDAO dao = new UsuarioDAOImpl();
        try{
            dao.excluirFuncionario(funcionario);
        } catch (Exception e) {
            throw new Error("Erro ao exclir funcionario" + e);
        }
    }
    
    public static List<Usuario> listarFuncionarios() throws SQLException, ClassNotFoundException{
        UsuarioDAO dao = new UsuarioDAOImpl();
        return dao.listAllFuncionarios();
    }
}
