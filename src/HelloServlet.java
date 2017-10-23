import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;

public class HelloServlet extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        Enumeration names = config.getInitParameterNames();
        while (names.hasMoreElements()) {
            String name = (String)names.nextElement();
            System.out.println(name);
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
