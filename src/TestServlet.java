import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Алёна on 03.03.2017.
 */
@WebServlet(name = "TestServlet")
public class TestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");//веб-страница будет ответом
        String a = req.getParameter("A");
        String b = req.getParameter("B");
        String c = req.getParameter("C");
        try {
            double coeffA = Double.parseDouble(a);
            double coeffB = Double.parseDouble(b);
            double coeffC = Double.parseDouble(c);
            Calculation object = new Calculation();
            double firstRoot = object.calc(coeffA, coeffB, coeffC)[0];
            double secondRoot = object.calc(coeffA, coeffB, coeffC)[1];
            req.setAttribute("outputA", firstRoot);
            req.setAttribute("outputB", secondRoot);
        } catch (Exception e) {
        }
        req.getRequestDispatcher("index.jsp").forward(req, resp);//обработка запроса
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
