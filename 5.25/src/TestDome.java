public class TestDome {
    //汉诺塔
    public static void main(String[] args) {
        hanota(1, 'A', 'B', 'C');
        System.out.println();
        hanota(2, 'A', 'B', 'C');
        System.out.println();
        hanota(3, 'A', 'B', 'C');
        System.out.println();
    }

    public static void move(char pos1, char pos2) {
        System.out.println(pos1 + "-->" + pos2);
    }

    public static void hanota(int n, char pos1, char pos2, char pos3) {
        if (n == 1) {
            move(pos1, pos3);
            return;
        }
        hanota(n - 1, pos1, pos3, pos2);
        move(pos1, pos3);
        hanota(n - 1, pos2, pos1, pos3);
    }


    //求斐波那契数列某一项
    public static void main9(String[] args) {
        System.out.println(fib(40));
    }

    public static int fib(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }


    public static void main8(String[] args) {
        System.out.println(sumOR(123));
    }

    public static int sumOR(int num) {
        if (num > 9) {
            sumOR(num / 10 + num % 10);
        }
        return num;
    }


    public static void main7(String[] args) {
        System.out.println(sumAdd(10));
    }

    public static int sumAdd(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumAdd(num - 1);
    }


    public static void main6(String[] args) {
        printf(123);
    }

    public static void printf(int n) {
        if (n > 9) {
            printf(n / 10);
        }
    }


    public static void main5(String[] args) {
        System.out.println(fac(5));
    }

    //
    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }


    public static void main4(String[] args) {
        System.out.println(sub(1, 2, 3, 4, 5));
        System.out.println(sub(1));

    }

    public static int sub(int... array) {
        int sub = 0;
        for (int i = 0; i < array.length; i++) {
            sub = sub - array[i];
        }
        return sub;
    }

    public static void main3(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(add(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }


    public static void main2(String[] args) {
        int[] array = {10, 20};
        swap(array);
        System.out.println(array[0] + "   " + array[1]);
    }

    public static void swap(int[] array2) {
        int tmp = array2[0];
        array2[0] = array2[1];
        array2[1] = tmp;
    }

    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + "    " + b);
        swap1(a, b);
        System.out.println(a + "    " + b);
    }

    //栈上的内存是拿不到的，java没有指针
    public static void swap1(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
