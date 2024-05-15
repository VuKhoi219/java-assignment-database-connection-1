import java.sql.*;
import java.util.Scanner;

public class ConnectSQL {
    String url = "jdbc:mysql://localhost:3306/java_assignment";
    String user = "root";
    String password = "";
    Scanner sc = new Scanner(System.in);

    public void show() {
        String sql = "select * from post";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("======================================================");
                System.out.println("ID:" + resultSet.getLong(1));
                System.out.println("Article title:" + resultSet.getString(2));
                System.out.println("Detail :" + resultSet.getString(3));
                System.out.println("Avatar :" + resultSet.getString(4));
                System.out.println("Writer  :" + resultSet.getString(5));
                System.out.println("Date_of_writing  :" + resultSet.getString(6));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void search(long id) {
        PreparedStatement preparedStatement = null;
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "select * from post where ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("======================================================");
                System.out.println("ID:" + resultSet.getLong(1));
                System.out.println("Article title:" + resultSet.getString(2));
                System.out.println("Detail :" + resultSet.getString(3));
                System.out.println("Avatar :" + resultSet.getString(4));
                System.out.println("Writer  :" + resultSet.getString(5));
                System.out.println("Date_of_writing  :" + resultSet.getString(6));
                System.out.println("enter to continue");
                sc.nextLine();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(PostList postList) {
        PreparedStatement preparedStatement = null;
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "insert into post(ID,`Article_title`,`Detail`,`Avatar`,`Writer`,`Date_of_writing`) values(?,?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, postList.getId());
            preparedStatement.setString(2, postList.getArticle_title());
            preparedStatement.setString(3, postList.getDetail());
            preparedStatement.setString(4, postList.getAvatar());
            preparedStatement.setString(5, postList.getWriter());
            preparedStatement.setString(6, postList.getDate_of_writing());
            preparedStatement.executeUpdate();
            System.out.println("Inserted");
            System.out.println("enter to continue");
            sc.nextLine();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(long id) {
        PreparedStatement preparedStatement = null;
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "delete from post where ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Deleted");
            System.out.println("enter to continue");
            sc.nextLine();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
