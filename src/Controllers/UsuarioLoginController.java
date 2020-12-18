/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.SQLException;
import models.DAO.UsuarioDAO;
import models.DAO.UsuarioDAOImpl;
import models.Usuario;
import views.Login;
import views.Menu;

/**
 *
 * @author kevin
 */
public class UsuarioLoginController {
    public static Usuario logar(String login, String senha) throws SQLException, ClassNotFoundException{
        UsuarioDAO dao = new UsuarioDAOImpl();
        Usuario usuario = dao.login(login, senha);
        return usuario;
    }
}
