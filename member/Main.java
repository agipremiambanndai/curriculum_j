package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import member.bean.AdminUser;
import member.bean.GeneralUser;
import member.bean.User;

public class Main {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("1. 一般ユーザーを登録");
            System.out.println("2. 管理者ユーザーを登録");
            System.out.println("3. ユーザー情報を表示");
            System.out.println("4. 終了");
            System.out.print("選択してください: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // 改行文字を消費

            switch (choice) {
                case 1:
                    registerGeneralUser(scanner);
                    break;
                case 2:
                    registerAdminUser(scanner);
                    break;
                case 3:
                    findUsers();
                    break;
                case 4:
                    keepRunning = false;
                    break;
                default:
                    System.out.println("無効な選択です。");
            }
        }

        scanner.close();
    }

    // 一般ユーザーを登録するメソッド
    private static void registerGeneralUser(Scanner scanner) {
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();
        System.out.print("メールアドレスを入力してください: ");
        String email = scanner.nextLine();

        if (isEmailRegistered(email)) {
            System.out.println("このメールアドレスは既に登録されています。");
        } else {
            users.add(new GeneralUser(name, email));
            System.out.println("一般ユーザーが登録されました。");
        }
    }
 // メールアドレスが既に登録されているか確認するメソッド
 private static boolean isEmailRegistered(String email) {
    for (User user : users) {
        if (user.getEmail().equals(email)) {
            return true;
        }
    }
    return false;
}
    // 管理者ユーザーを登録するメソッド
    private static void registerAdminUser(Scanner scanner) {
        System.out.print("管理者の名前を入力してください: ");
        String name = scanner.nextLine();
        System.out.print("管理者のメールアドレスを入力してください: ");
        String email = scanner.nextLine();

        if (isEmailRegistered(email)) {
            System.out.println("このメールアドレスは既に登録されています。");
        } else {
            System.out.print("管理者コードを入力してください: ");
            String adminCode = scanner.nextLine();
            users.add(new AdminUser(name, email, adminCode));
            System.out.println("管理者ユーザーが登録されました。");
        }
    }

    // 登録されたユーザーを表示するメソッド
    private static void findUsers() {
        if (users.isEmpty()) {
            System.out.println("登録されたユーザーはいません。");
        } else {
            System.out.println("登録されたユーザー:");
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}

