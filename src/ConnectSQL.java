import java.sql.*;

public class ConnectSQL {
    String url = "jdbc:mysql://localhost:3306/java_assignment_1";
    String user = "root";
    String password = "";

    public void show() {
        String sql = "select * from java_assignment_1";
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement Statement = connection.createStatement();
            ResultSet resultSet = Statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getLong(1));
                System.out.println("Article_title: " + resultSet.getString(2));
                System.out.println("Detail: " + resultSet.getString(3));
                System.out.println("Avatar: " + resultSet.getString(4));
                System.out.println("Main content: " + resultSet.getString(5));
                System.out.println("Author: " + resultSet.getString(6));
                System.out.println("Date_of_writing: " + resultSet.getString(7));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void search(long id) {
        PreparedStatement ps = null;
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "select * from java_assignment_1 where id = ?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getLong(1));
                System.out.println("Article_title: " + resultSet.getString(2));
                System.out.println("Detail: " + resultSet.getString(3));
                System.out.println("Avatar: " + resultSet.getString(4));
                System.out.println("Main Content: " + resultSet.getString(5));
                System.out.println("Author:" + resultSet.getString(6));
                System.out.println("Date_written: " + resultSet.getString(7));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insert(PostList postList) {
        PreparedStatement ps = null;
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "insert into java_assignment_1(ID,`Article_title`,`Detail`,`Avatar`,`Main_Content`,`Author`,`Date_written`) values(?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, postList.getId());
            ps.setString(2, postList.getArticle_title());
            ps.setString(3, postList.getDetail());
            ps.setString(4, postList.getAvatar());
            ps.setString(5, postList.getMain_content());
            ps.setString(6, postList.getAuthor());
            ps.setString(7, postList.getDate_written());
            ps.executeUpdate();
            System.out.println("Successfully inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(long id) {
        PreparedStatement ps = null;
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "delete from java_assignment_1 where id = ?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            ps.executeUpdate();
            System.out.println("Successfully delete");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
