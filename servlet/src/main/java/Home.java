import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Home extends HttpServlet {
    List<User> users = Arrays.asList(
            new User(1, "vasya"),
            new User(2, "anya"),
            new User(3, "masha"),
            new User(4, "olya")
    );

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        String isString = pathInfo.replace("/", "");
        int id = Integer.parseInt(isString);

        req.setAttribute("user", users.get(id - 1));
        req.getRequestDispatcher("/pages/user.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
