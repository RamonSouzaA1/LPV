/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.io.IOException;
import controller.Action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Departamento;
import persistence.DepartamentoDAO;

/**
 *
 * @author Ramon
 */
public class LerDepartamentoAction implements Action{
    public void execute(HttpServletRequest request,
            HttpServletResponse response) throws IOException{
            try{
                List<Departamento> departamentos = new ArrayList<Departamento>();
                departamentos = DepartamentoDAO.getInstance().obterDepartamentos();
                request.setAttribute("departamentos", departamentos);
                RequestDispatcher view = request.getRequestDispatcher("departamentoConsulta.jsp");
                view.forward(request, response);
            } catch(SQLException ex)
            {
                response.sendRedirect("erro.jsp");
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (ServletException ex) {
            Logger.getLogger(LerContatoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
