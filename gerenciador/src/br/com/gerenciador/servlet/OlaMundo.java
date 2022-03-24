package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/ola", "/oi"}, loadOnStartup=1) 
public class OlaMundo extends HttpServlet {
  
  public OlaMundo() {
    System.out.println("Criando o servlet.");
  }
  
  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    PrintWriter saida = response.getWriter();
    saida.println("<html>");
    saida.println("<body>");
    saida.println("Meu primeiro servlet!");
    saida.println("</body>");
    saida.println("</html>");
    
    System.out.println("O servlet foi chamado.");
    
  }

}
