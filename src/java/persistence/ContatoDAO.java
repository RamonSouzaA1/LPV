
package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Contato;

/**
 *
 * @author Aluno
 */
public class ContatoDAO {

    private static ContatoDAO instance = new ContatoDAO();
    private ContatoDAO(){
        
    }
    public static ContatoDAO getInstance() {
        return instance;
    }

    public void save(Contato contato) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into contato (nome, email)"
                    + " values ('" + contato.getNome() + "', '" + contato.getEmail() + "')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public List<Contato> obterContatos() throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Statement st = null;
        List<Contato> contatos = new ArrayList<Contato>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from contato");
            while (rs.next()){
                Contato contato = new Contato
                                   (rs.getInt("id"),
                                    rs.getString("nome"),
                                    rs.getString("email"));
                contatos.add(contato);
            }
        }catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
        return contatos;
    }

    public void delete(Contato contato) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("DELETE FROM contato WHERE id = " + contato.getId());
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }

    
    private void closeResources(Connection conn, Statement st) {
        try {
            if (st != null) {
                st.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {

        }
    }

}
