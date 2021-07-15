package ruanko.newspublish.action.user;

import ruanko.newspublish.biz.UserBiz;
import ruanko.newspublish.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("username"), req.getParameter("password"));

        UserBiz userBiz = new UserBiz();
        boolean flag = userBiz.judgeUser(user);

        if (flag) {
            req.getRequestDispatcher("wisdommedical/index.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }

    }
}
