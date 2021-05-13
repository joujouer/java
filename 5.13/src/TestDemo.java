import java.util.ArrayList;
import java.util.List;

/**
 * @date:2021/5/13 22:43
 * @author:Linyue314 2548360113@qq.com
 */
public class TestDemo {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 1, 4, 4};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}