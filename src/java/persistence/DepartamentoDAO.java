/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Departamento;

/**
 *
 * @author Ramon
 */
public class DepartamentoDAO {
    
    private static DepartamentoDAO instance = new DepartamentoDAO();
    private DepartamentoDAO(){
        
    }
    
    public void save(Departamento departamento) throws SQLException,
            ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("insert into departamento (nome, id_contato)"
                    + " values ('" + departamento.getNome() + "', '"+ departamento.getIdContato() +"')");
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public List<Departamento> obterDepartamentos() throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Statement st = null;
        List<Departamento> departamentos = new ArrayList<Departamento>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from departamento");
            while (rs.next()){
                Departamento departamento = new Departamento
                                   (rs.getInt("id"),
                                    rs.getString("nome"),
                                    rs.getInt("id_contato"));
                departamentos.add(departamento);
            }
        }catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
        return departamentos;
    }
    
    public void delete(Departamento departamento) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("DELETE FROM departamento WHERE id = " + departamento.getId());
        } catch (SQLException e) {
            throw e;
        } finally {
            closeResources(conn, st);
        }
    }
    
    public static DepartamentoDAO getInstance(){
        return instance;
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
