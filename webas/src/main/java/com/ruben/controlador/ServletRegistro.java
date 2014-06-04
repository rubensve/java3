
package com.ruben.controlador;

import com.ruben.model.Mascota;
import com.ruben.model.Perro;
import com.ruben.model.Persona;
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
       
       Mascota mascota= new Perro();
        
       Persona p= new Persona();
       p.setMascota(mascota);
       
     
       request.setAttribute("registro", p);
       RequestDispatcher despachador= request.getRequestDispatcher("/registro.jsp");
       despachador.forward(request, response);
    }

}
