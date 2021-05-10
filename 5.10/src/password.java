import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count != 0) {
            String str = scanner.nextLine();
            if (str.equals("1234567")) {
                System.out.println("密码正确");
                break;
            } else {
                count--;
                System.out.println("密码错误");
            }
        }
    }
}
