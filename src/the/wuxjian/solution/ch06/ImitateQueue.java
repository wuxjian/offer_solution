package the.wuxjian.solution.ch06;

import java.util.Stack;

/**
 * 题目描述： 用两个栈来实现一个队列， 完成队列的 Push 和 Pop 操作。 队列中的
 * 元素为 int 类型。
 * Created by wuxjian on 2021/4/2
 */
public class ImitateQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int e) {
        stack1.push(e);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        ImitateQueue queue = new ImitateQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.pop());
    }
}
