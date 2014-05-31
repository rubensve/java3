
package com.ruben.controlador;

import com.ruben.webas.Perro;
import com.ruben.webas.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletRegistro extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Perro perro= new Perro();
       perro.setNombre("Sultan");
       
       Persona p= new Persona();
       p.setPerro(perro);
       
       request.setAttribute("registro", p);
       RequestDispatcher despachador= request.getRequestDispatcher("/registro.jsp");
       despachador.forward(request, response);
    }

}
