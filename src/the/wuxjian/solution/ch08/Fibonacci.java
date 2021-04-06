package the.wuxjian.solution.ch08;

/**
 * Created by wuxjian on 2021/4/2
 */
public class Fibonacci {
    // 递归
    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    // 非递归
    public static int fibonacci2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        int result = 0;
        int first = 1;
        int second = 1;
        for (int i = 2; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(fibonacci2(7));
    }


}
