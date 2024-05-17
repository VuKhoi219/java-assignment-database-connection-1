import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.choice();
    }

    public void choice() {
        PostController postController = new PostController();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter your selection");
            System.out.println("1. Add new Post");
            System.out.println("2. Show list of newly added posts");
            System.out.println("3. Search post(by ID)");
            System.out.println("4. Delete post(by ID)");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    postController.insertPost();
                    break;
                case 2:
                    postController.show();
                    break;
                case 3:
                    postController.searchPost();
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