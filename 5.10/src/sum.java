/**
 * @author linyue
 */
public class sum {
    public static void main(String[] args) {
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0 / i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }
}
