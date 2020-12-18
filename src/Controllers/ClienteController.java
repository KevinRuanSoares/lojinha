package Controllers;

import java.sql.SQLException;
import java.util.List;
import models.DAO.ClienteDAO;
import models.DAO.ClienteDAOImp;
import models.Clientes;

/**
 *
 * @author vinit
 */
public class ClienteController {
    public static void inserir(String nome) throws SQLException, ClassNotFoundException{
        Clientes cliente = new Clientes();
        cliente.setNome(nome);
        cliente.setSenha(senha);
        ClienteDAO dao = new ClienteDAOImp();
        try{
            dao.cadastraFuncionario(cliente);
        } catch (Exception e) {
            throw new Error("Erro ao cadastrar cliente" + e);
        }
        
    }
    public static void editar(Clientes cliente) throws SQLException, ClassNotFoundException{
        ClienteDAO dao = new ClienteDAOImp();
        try{
            dao.editaCliente(cliente);
        } catch (Exception e) {
            throw new Error("Erro ao editar cliente" + e);
        }
    }
    
    public static void excluir(Clientes cliente) throws SQLException, ClassNotFoundException{
        ClienteDAO dao = new ClienteDAOImp();
        try{
            dao.excluirCliente(cliente);
        } catch (Exception e) {
            throw new Error("Erro ao excluir cliente" + e);
        }
    }
    
    public static List<Clientes> listarCliente() throws SQLException, ClassNotFoundException{
        ClienteDAO dao = new ClienteDAOImp();
        return dao.listAllClientes();
    }
}
