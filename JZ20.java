package jz;

import java.util.Stack;

public class JZ20 {
/**
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数，并且调用 min函数、push函数 及 pop函数 的时间复杂度都是 O(1)
 * push(value):将value压入栈中
 * pop():弹出栈顶元素
 * top():获取栈顶元素
 * min():获取栈中最小元素
 *
 * */
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();
    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty()){
            stack2.push(node);
        }else{
            stack2.push(Math.min(node,stack2.peek()));
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
