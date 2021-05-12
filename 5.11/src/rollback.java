import java.util.Scanner;

public class rollback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        System.out.println(str2);


    }
}
