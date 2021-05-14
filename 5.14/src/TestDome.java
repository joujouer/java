import java.util.ArrayList;
import java.util.List;

/**
 * @date:2021/5/14 21:50
 * @author:Linyue314 2548360113@qq.com
 */
public class TestDome {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 3, 4, 1, 3};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            list.add(count);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= (list.size() / 2)) {
                System.out.println(arr[i]);
            }
        }
    }
}
