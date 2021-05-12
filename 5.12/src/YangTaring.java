import java.util.ArrayList;
import java.util.List;

/**
 * @author linyue
 */
public class YangTaring {
    public static void main(String[] args) {
        //存储杨辉三角形的
        List<List<Integer>> list = new ArrayList<>();
        int n = 0;
        List<Integer> init = new ArrayList<>();
        init.add(1);
        list.add(init);

        while (n != 10) {
            //存储每一行的数据
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int i = 1; i < list.get(n).size(); i++) {
                row.add(list.get(n).get(i - 1) + list.get(n).get(i));
            }
            row.add(1);
            list.add(row);
            n++;
        }
        System.out.println(list);
    }
}
