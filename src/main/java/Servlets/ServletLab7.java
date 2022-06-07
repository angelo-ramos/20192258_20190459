package Servlets;

import Daos.ActoresDao;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletLab7", value = "")
public class ServletLab7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ActoresDao actoresDao = new ActoresDao();
        request.setAttribute("listaActores", actoresDao.listarActores());

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("pantalla.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
