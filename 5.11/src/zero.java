import java.util.Scanner;

public class zero {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数a");
        int a = scanner.nextInt();
        long sum = 1;
        for (int i = 1; i <= a; i++) {
            sum = i * sum;
        }
        System.out.println("a的阶乘为" + sum);
        while (true) {
            if (sum % 10 == 0) {
                sum = sum / 10;
                count++;
            } else {
                break;
            }
        }
        System.out.println("a的阶乘末尾有" + count + "个零");
    }
}
