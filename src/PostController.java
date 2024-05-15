import java.util.Scanner;

public class PostController {
    ConnectSQL sql = new ConnectSQL();

    public void insertPost() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Enter ID : ");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Article title : ");
        String Article_title = sc.nextLine();
        System.out.println("Enter Detail  : ");
        String detail = sc.nextLine();
        System.out.println("Enter Avatar  : ");
        String avatar = sc.nextLine();
        System.out.println("Enter Writer : ");
        String writer = sc.nextLine();
        System.out.println("Enter Date of writing : ");
        String date = sc.nextLine();
        PostList postList = new PostList(id, Article_title, detail, avatar, writer, date);
        sql.insert(postList);
    }

    public void searchPost() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID : ");
        long id = sc.nextLong();
        sql.search(id);
    }

    public void deletePost() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID : ");
        long id = sc.nextLong();
        sql.delete(id);
    }
}
