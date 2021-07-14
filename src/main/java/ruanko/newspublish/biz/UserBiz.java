package ruanko.newspublish.biz;

import ruanko.newspublish.dao.UserDao;
import ruanko.newspublish.entity.User;

public class UserBiz {

    private UserDao userDao = new UserDao();

    public boolean judgeUser(User user) {
        if ("".equals(user.getUserName()) || "".equals(user.getPassword())) {
            return false;
        }
        User u = userDao.getUser(user);
        return  u.getPassword().equals(user.getPassword());
    }

    public boolean register(User user) {
        User u = userDao.getUser(user);
        //查询数据库中待注册user是否存在
        if (u == null) {
            //数据库中不存在，允许创建
            userDao.add(user);
            return true;
        }
        //数据库中不存在
        return false;
    }
}


