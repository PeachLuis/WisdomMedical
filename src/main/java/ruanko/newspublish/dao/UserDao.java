package ruanko.newspublish.dao;

import ruanko.newspublish.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends BaseDao{

    public void add(User user) {
        String sql = "INSERT INTO user(username, password) VALUES('" +
                user.getUserName() +
                "','" +
                user.getPassword() +
                "')";

        executeUpdate(sql);
    }

    public void deleteByUser(User user) {
        String sql = "DELETE FROM user WHERE username=" + user.getUserName();
        executeUpdate(sql);
    }

    public void deleteAll() {
        String sql = "DELETE FROM user";
        executeUpdate(sql);
    }

    public User getUser(User user) {
        String sql = "SELECT * FROM user where username=" + "'" + user.getUserName() + "'";
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                User u = new User(resultSet.getString("username"), resultSet.getString("password"));
                closeAll(connection, statement, resultSet);
                return u;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM user";
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                User u = new User(resultSet.getString("username"), resultSet.getString("password"));
                users.add(u);
            }
            closeAll(connection, statement, resultSet);
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        users.clear();
        return users;
    }

}
