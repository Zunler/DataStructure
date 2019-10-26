/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Stack
 * Author:   pengzijun
 * Date:     2019/10/26 10:26 下午
 * Description: 栈
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package ADT;

/**
 * 〈一句话功能简述〉<br>
 * 〈栈〉
 *
 * @author pengzijun
 * @create 2019/10/26
 * @since 1.0.0
 */
public class Stack {
    int[] stack = new int[100];
    int count = 0;

    public boolean isEmpty() {
        return count == 0 ? true : false;
    }

    public boolean isFull() {
        return count == stack.length ? true : false;
    }

    public int pop() {
        if (count != 0) {

            count--;
            return  stack[count];
        }

        return Integer.parseInt(null);
    }

    public void push(int element) {
        if (count < stack.length) {
            stack[count] = element;
            count++;
        } else {
            System.out.println("error");
        }

    }

    public int cal(String str) {
        String[] split = str.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("+")) {
                int a = pop();
                int b = pop();
                push(a + b);
            } else if (split[i].equals( "-")) {
                int a = pop();
                int b = pop();
                push(b-a);
            } else if (split[i].equals("*")) {
                int a = pop();
                int b = pop();
                push(a * b);
            } else {
                push(Integer.parseInt(split[i]));
            }

        }
        return pop();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.cal("11 21 + 31 41 - *"));

    }
}