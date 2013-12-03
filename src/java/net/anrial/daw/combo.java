package net.anrial.daw;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ana
 */
public class combo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            combos oCombos = new combos();
            validar oValidar = new validar();
            if(oValidar.numero(request.getParameter("marca")) != -1){
                oCombos.setMarca(oValidar.numero(request.getParameter("marca")));
            }
            if(oValidar.numero(request.getParameter("modelo")) != -1){
                oCombos.setModelo(oValidar.numero(request.getParameter("modelo")));
            }
            if(oValidar.numero(request.getParameter("color")) != -1){
                oCombos.setColor(oValidar.numero(request.getParameter("color")));
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet combo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ejercicio 04 Combos</h1>");
            if(oCombos.getMarca() != 0){
                if(oCombos.getMarca() != 0 && oCombos.getModelo() != 0){
                    if(oCombos.getMarca() != 0 && oCombos.getModelo() != 0 && oCombos.getColor() != 0){
                        out.println(oCombos.resumen());
                    }else{
                        out.println(oCombos.color());
                    }
                }else{
                    out.println(oCombos.modelo());
                }
            }
            out.println("<p><a href=\"" + request.getContextPath() + "\">Volver al principio</a></p>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
