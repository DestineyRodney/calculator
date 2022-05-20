import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "CalculateServlet", value = "/calculate")
public class CalculateServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        String sign = request.getParameter("sign");

        if (Objects.equals(sign, "+")) {
            int sum = a + b;
            response.getWriter().println(a + " + " + b + " = " + sum);
        } else if (Objects.equals(sign, "-")) {
            int sum = a - b;
            response.getWriter().println(a + " - " + b + " = " + sum);
        } else if (Objects.equals(sign, "/")) {
            int sum = a / b;
            response.getWriter().print(a + " / " +  b + " = " + sum);
        } else {
            int sum = a * b;
            response.getWriter().println(a + " * " + b + " = " + sum);
        }
    }
}
