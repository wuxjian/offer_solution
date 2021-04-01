package the.wuxjian.solution.common;

/**
 * Created by wuxjian on 2021/4/1
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode buildListNode(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            cur.next = newNode;
            cur = newNode;
        }
        return head;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode cur = this;
        while (cur != null) {
            builder.append(cur.val).append("->");
            cur = cur.next;
        }
        builder.append("null");
        return builder.toString();
    }

    public static void main(String[] args) {
        ListNode node = buildListNode(new int[]{1, 2, 3, 4, 5});
        System.out.println(node);

    }
}
