package the.wuxjian.solution.ch07;

/**
 * 题目描述： 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之为数组的
 * 旋转。 输入一个非递减排序的数组的一个旋转， 输出旋转数组的最小元素。 例如
 * 数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转， 该数组的最小值为 1。 NOTE： 给出的所
 * 有元素都大于 0， 若数组大小为 0， 请返回-1。 假设数组中不存在重复元素。
 * Created by wuxjian on 2021/4/2
 */
public class MinInReversingList {
    public static int minInReversingList(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length == 1 || array[array.length - 1] > array[0]) {
            return array[0];
        }
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] > array[mid + 1]) {
                return array[mid + 1];
            }
            if (array[mid - 1] > array[mid]) {
                return array[mid];
            }
            if (array[mid] > array[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
