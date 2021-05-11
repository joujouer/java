import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nextline方法可以读取空字符串
        String str = sc.nextLine();
        String str2 = new StringBuilder(str).reverse().toString();
        if (str.equals(str2)) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }
    }
}

