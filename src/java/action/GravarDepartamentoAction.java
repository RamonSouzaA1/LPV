/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Departamento;
import persistence.DepartamentoDAO;

/**
 *
 * @author Ramon
 */
public class GravarDepartamentoAction implements Action{

    public GravarDepartamentoAction() {
    }
    
    public void execute(HttpServletRequest request,
            HttpServletResponse response) throws IOException{
        String nome = request.getParameter("txtNome");
        int idContato = Integer.parseInt(request.getParameter("txtIdContato"));
        if(nome.equals("")){
            response.sendRedirect("index.jsp");
        } else{
            try{
                Departamento departamento = new Departamento(nome, idContato);
                DepartamentoDAO.getInstance().save(departamento);
                response.sendRedirect("sucesso.jsp");
            } catch(SQLException ex)
            {
                response.sendRedirect("erro.jsp");
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        }
    }
}
