package com.aula114;

import java.util.List;
import java.util.ArrayList;

import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebInitParam;

public class Ultimo extends HttpServlet {
   /* @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType("text/html");
        String browser = request.getHeader("User-Agent");
        String queryString = request.getQueryString();
        String admin = getServletConfig().getInitParameter("admin");
        String email = getServletConfig().getInitParameter("email");
        String pathInfo = request.getPathInfo();
        String rURI = request.getRequestURI();
        String contextpath = request.getContextPath();
        String path = rURI.substring(contextpath.length());
        PrintWriter writer = response.getWriter();
        writer.print("<!DOCTYPE html>"
                + "<html>"
                + "<head><title>Title</title></head>"
                + "<body><h1>TTIITle</h1>"
                + "<h2>" + browser  + "</h2>"
                + "<h3>" + queryString  + "</h3>"
                + "<h3>" + admin  + "</h3>"
                + "<h3>" + email  + "</h3>"
                + "<h3>" + pathInfo  + "</h3>"
                + "<h3>" + rURI + "</h3>"
                + "<h3>" + contextpath + "</h3>"
                + "<h3>" + path + "</h3>"
                + "<form method='post'>"
                + "<table><tr><td>Name:</td><td><input name='name'/></td></tr><tr><td>Country:</td><td><input name='country'/></td></tr></table>"
                + "<input type='submit'/>"
                + "</form>"
                + "</body>"
                + "</html>");
    }
    */
    @Override
    public void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException,
            IOException {
        Persona p=new Persona();
        System.out.println("entrando en post");
        p.setNombre(request.getParameter("nombre"));
        p.setApellido(request.getParameter("apellido"));
        p.setPais(request.getParameter("pais"));
        p.setCorreo(request.getParameter("correo"));
        request.setAttribute("pers",p);
	    request.getRequestDispatcher("/mi.jsp").forward(request,response);
        /*
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<head>");
        writer.print("<title>" + "Titleee" + "</title></head>");
        writer.print("<body><h1>TTIIIII</h1>");
        writer.print("<p>Name: " + request.getParameter("name") + "</p>");
        String country = request.getParameter("country");
        writer.print("<p>Pais: " + country + "</p>");
        writer.print("</body></html>");
        */
        System.out.println("saliendo de post");
    }

}
