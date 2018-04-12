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
import model.Contato;
import persistence.ContatoDAO;

/**
 *
 * @author Ramon
 */
public class EditarContatoAction implements Action{
    public EditarContatoAction(){
    }
    
    public void execute(HttpServletRequest request,
            HttpServletResponse response) throws IOException{
        int id = Integer.parseInt(request.getParameter("txtId"));
        String nome = request.getParameter("txtNome");
        String email = request.getParameter("txtEmail");
        if(nome.equals("") || email.equals((""))){
            response.sendRedirect("index.jsp");
        } else{
            try{
                Contato contato = ContatoDAO.obterContato(id);
                ContatoDAO.editar(contato, nome, email);
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
