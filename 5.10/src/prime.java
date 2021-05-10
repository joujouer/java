import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int i = 2;
            for (; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.println("不是素数");
                    break;
                }
            }
            if (i > Math.sqrt(n)) {
                System.out.println("是素数");
            }
        }
    }
}