import java.util.Scanner;

public class PostController {
    ConnectSQL sql = new ConnectSQL();
    Scanner sc = new Scanner(System.in);
    long id;
    String article_title, detail, avatar, content, author, date;

    public void show() {
        sql.show();
        System.out.println("Press Enter to continue ");
        sc.nextLine();
    }

    public void insertPost() {
        System.out.println("===============================================================");
        System.out.println("Enter ID: ");
        id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Article title: ");
        article_title = sc.nextLine();
        System.out.println("Enter Detail: ");
        detail = sc.nextLine();
        System.out.println("Enter Avatar: ");
        avatar = sc.nextLine();
        System.out.println("Enter Main content: ");
        content = sc.nextLine();
        System.out.println("Enter Author: ");
        author = sc.nextLine();
        System.out.println("Enter Date_written: ");
        date = sc.nextLine();
        PostList postList = new PostList(id, article_title, detail, avatar, content, author, date);
        sql.insert(postList);
        System.out.println("Press Enter to continue ");
        sc.nextLine();
    }

    public void searchPost() {
        System.out.println("Enter ID: ");
        id = sc.nextLong();
        sc.nextLine();
        sql.search(id);
        System.out.println("Press Enter to continue ");
        sc.nextLine();
    }

    public void deletePost() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = sc.nextLong();
        sc.nextLine();
        sql.delete(id);
        System.out.println("Press Enter to continue ");
        sc.nextLine();
    }
}