import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a < n) {
                System.out.println("猜小了");
            } else {
                if (a > n) {
                    System.out.println("猜大了");
                } else {
                    System.out.println("猜对了");
                    break;
                }
            }
        }
    }
}
