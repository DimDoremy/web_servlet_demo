import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "SubmitServlet")
public class SubmitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        InputStream inputStream = this.getServletContext().getResourceAsStream("user.properties");
        this.getServletConfig().getServletContext();
        Properties props = new Properties();
        props.load(inputStream);
        PrintWriter out = response.getWriter();
        if (!name.equals(props.getProperty("username")) || !password.equals(props.getProperty("password"))){
            out.println("登录失败");
        } else {
            out.println("登录成功");
        }
    }
}
