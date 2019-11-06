import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/users";
        String user = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement query = connection.prepareStatement("select * from user");
        ResultSet resultSet = query.executeQuery();

        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString(2);
            users.add(new User(id, name));
        }
        System.out.println(users);
    }
}
