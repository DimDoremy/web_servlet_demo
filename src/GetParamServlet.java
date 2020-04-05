import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "GetParamServlet")
public class GetParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        ServletContext context = this.getServletContext();
        Enumeration<String> paramNames = context.getInitParameterNames();
        out.println("全局context-param:");
        out.println("<br />");
        while (paramNames.hasMoreElements()) {
            String name = paramNames.nextElement();
            String value = context.getInitParameter(name);
            out.println(name + ":" + value);
            out.println("<br />");
        }

        ServletConfig config = this.getServletConfig();
        Enumeration<String> configNames = config.getInitParameterNames();
        out.println("局部init-param:");
        out.println("<br />");
        while (configNames.hasMoreElements()) {
            String name = configNames.nextElement();
            String value = config.getInitParameter(name);
            out.println(name + ":" + value);
            out.println("<br />");
        }
    }
}
