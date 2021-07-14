package ruanko.newspublish.action.user;

import ruanko.newspublish.biz.UserBiz;
import ruanko.newspublish.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("username"), req.getParameter("password"));

        UserBiz userBiz = new UserBiz();

        if (userBiz.register(user)) {
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
    }
}
