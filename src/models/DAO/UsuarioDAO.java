package models.DAO;

import java.util.List;
import models.Usuario;

/**
 *
 * @author kevin
 */
public interface UsuarioDAO {
    public Usuario login(String login, String Senha);
    public void save(Usuario usuario);
    public void getUsuarioById(int id);
    public List<Usuario> listAllUsuarios();
}
