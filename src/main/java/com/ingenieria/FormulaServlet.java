package com.ingenieria;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FormulaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String figure = request.getParameter("figure");
        String formula = switch (figure) {
            case "circle" -> "Área = π × r²";
            case "triangle" -> "Área = ½ × base × altura";
            case "square" -> "Área = lado²";
            default -> "Figura no reconocida";
        };
        response.getWriter().println("<h1>Fórmula: " + formula + "</h1>");
    }
}