package the.wuxjian.solution.ch04;

import the.wuxjian.solution.common.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述： 输入一个链表， 从尾到头打印链表每个节点的值。
 * Created by wuxjian on 2021/4/1
 */
public class PrintListFromTailToHead {
    // 借用栈
    public static ArrayList<Integer> printListFromTailToHead(ListNode node) {
        ArrayList<Integer> retList = new ArrayList<>();

        Stack<ListNode> stack = new Stack<>();

        ListNode curNode = node;
        while (curNode != null) {
            stack.push(curNode);
            curNode = curNode.next;
        }

        while (!stack.isEmpty()) {
            retList.add(stack.pop().val);
        }
        return retList;
    }

    //
    public static ArrayList<Integer> printListFromTailToHead2(ListNode node) {
        ArrayList<Integer> retList = new ArrayList<>();
        if (node != null) {
            if (node.next != null) {
                retList = printListFromTailToHead2(node.next);
            }

            retList.add(node.val);
        }
        return retList;
    }

    public static void main(String[] args) {
        ListNode node = ListNode.buildListNode(new int[]{1, 2, 3, 4, 5});
        ArrayList<Integer> list = printListFromTailToHead(node);
        System.out.println(list);


        list = printListFromTailToHead2(node);
        System.out.println(list);
    }

}
