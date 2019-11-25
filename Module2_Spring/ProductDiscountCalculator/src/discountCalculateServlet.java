import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "discountCalculateServlet",urlPatterns = "/discount")
public class discountCalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String productDescription = request.getParameter("productDescription");
float listPrice = Float.parseFloat(request.getParameter("listPrice"));
float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
Float discountAmount = listPrice*discountPercent;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Description : " + productDescription +"<h1>");
        writer.println("<h1> List Price : " + listPrice +"<h1>");
        writer.println("<h1> Discount Percent" + discountPercent +"<h1>");
        writer.println("<h1> Discount Amount" + discountAmount +"<h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
