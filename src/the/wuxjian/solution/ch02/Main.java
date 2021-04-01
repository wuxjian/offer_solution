package the.wuxjian.solution.ch02;

/**
 * 题目描述： 在一个二维数组中， 每一行都按照从左到右递增的顺序排序， 每一列
 * 都按照从上到下递增的顺序排序。 请完成一个函数，输入这样的一个二维数组和一
 * 个整数， 判断数组中是否含有该整数。
 * 思路：从右上角或左下角查找
 *
 * Created by wuxjian on 2021/4/1
 */
public class Main {

    //时间复杂度：O(mn)
    public static boolean find1(int[][] array, int target) {
        int row = 0;
        int column = array[0].length - 1;
        while (row < array.length && column >= 0) {
            if (target == array[row][column]) {
                return true;
            }
            if (target < array[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }

    // 时间复杂度O(log mn)
    public static boolean find2(int[][] array, int target) {
        int left = 0;
        int right = array.length * array[0].length - 1;
        int col = array[0].length;
        while (left <= right) {
            int mid = (left + right) / 2;
            int value = array[mid / col] [mid % col];
            if (value == target) {
                return true;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return false;
    }


    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(find2(array, 13));
    }
}
