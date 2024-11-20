package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        String usuario = req.getParameter("usuario");
        String contrasena = req.getParameter("contrasena");

        if (usuario.equals("claudio") && contrasena.equals("1234")){
            resp.sendRedirect("Bienvenida.jsp");
        } else {
            resp.sendRedirect("index.jsp?=error1");
        }
    }


}
