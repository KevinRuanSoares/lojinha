


import java.sql.SQLException;
import models.DAO.UsuarioDAO;
import models.DAO.UsuarioDAOImpl;
import models.Usuario;
import views.Login;
import views.Menu;

public class Main {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Login login_view = new Login();
        login_view.setVisible(true);
    }
    
}
