package models.DAO;

import java.util.List;
import models.Usuario;

/**
 *
 * @author kevin
 */
public interface UsuarioDAO {
    public Usuario login(String login, String Senha);
    public void cadastraFuncionario(Usuario usuario);
    public void editaFuncionario(Usuario usuario);
    public void getFuncionarioById(int id);
    public List<Usuario> listAllFuncionarios();
}
