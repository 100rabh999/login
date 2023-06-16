import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Add your login logic here
        if (username.equals("shinchan") && password.equals("shinchan123")) {
            // If login is successful, redirect to a success page
            response.sendRedirect("success.jsp");
        } else {
            // If login fails, redirect back to the login page with an error message
            response.sendRedirect("login.jsp?error=1");
        }
    }
}
