import clases.triangulo;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Calcular_Triangulo_Servlet")
public class Calcular_Triangulo_Servlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double base = Double.parseDouble(request.getParameter("base"));
        double altura = Double.parseDouble(request.getParameter("altura"));

        double area = triangulo.calcularArea(base, altura);
        double perimetro = triangulo.calcularPerimetro(base);

        request.setAttribute("area", area);
        request.setAttribute("perimetro", perimetro);

        request.getRequestDispatcher("Resultado.jsp").forward(request, response);
    }
}
