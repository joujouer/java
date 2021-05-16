import java.util.Scanner;

/**
 * @date:2021/5/16 21:57
 * @author:Linyue314 2548360113@qq.com
 */
public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        String arr = String.valueOf(sc);
        while (arr.length() > 1) {
            int sum = 0;
            for (int i = 0; i < arr.length(); i++) {
                sum += Integer.parseInt(arr.charAt(i) + "");
            }
            arr = sum + "";
        }
        System.out.println("这个数的根为：" + arr);
    }
}
