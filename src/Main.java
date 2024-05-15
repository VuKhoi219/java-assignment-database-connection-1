import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.choice();
    }

    public void choice() {
        ConnectSQL connectSQL = new ConnectSQL();
        PostController postController = new PostController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your selection");
            System.out.println("1. Show");
            System.out.println("2. Search");
            System.out.println("3. Insert");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    connectSQL.show();
                    break;
                case 2:
                    postController.searchPost();
                    break;
                case 3:
                    postController.insertPost();
                    break;
                case 4:
                    postController.deletePost();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}