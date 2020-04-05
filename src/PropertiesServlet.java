import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "PropertiesServlet")
public class PropertiesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream inputStream = this.getServletContext().getResourceAsStream("/data.properties");
        this.getServletConfig().getServletContext();

        Properties props = new Properties();
        props.load(inputStream);

        String number = props.getProperty("number");
        String name = props.getProperty("name");
        PrintWriter out = response.getWriter();
        out.println(props);
        out.println("number:" + number);
        out.println("name:" + name);
    }
}
