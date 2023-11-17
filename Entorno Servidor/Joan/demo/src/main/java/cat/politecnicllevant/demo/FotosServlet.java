package cat.politecnicllevant.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Photos", value="/photos")
public class FotosServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        File direcotriFotos = new File("C:\\Users\\Jaume Fernandez\\Desktop\\clase\\clase-main\\Segundo\\Entorno Servidor\\Joan\\demo\\src\\main\\webapp\\upload");

        File[] fotos = direcotriFotos.listFiles();

        /*for (File foto:fotos) {

            System.out.println(foto.getAbsolutePath());

        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Photos</h1>");
        for (File foto:fotos) {
            out.println("<img src = \"upload/" + foto.getName() +"\" alt="+foto.getName()+"></img>");

        }
        out.println("</body></html>");

         */

        request.setAttribute("titol","Fotos xules");
        request.getRequestDispatcher("fotos.jsp").forward(request,response);
    }
}
