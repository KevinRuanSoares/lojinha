package models.DAO;

import java.util.List;
import models.Clientes;

/**
 *
 * @author vinit
 */
public interface ClienteDAO {
    public void cadastra_cliente(Clientes nome);
    public void edita_cliente(Clientes nome);
    public void getCliById(int id);
    public List<Clientes> listAllClientes();
}