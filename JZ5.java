import java.util.Stack;

public class JZ5 {

    /**
     *
     * 用两个栈来实现一个队列
     * 分别完成在队列尾部插入整数(push)和在队列头部删除整数(pop)的功能。
     *
     * */

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while(!stack2.isEmpty()){
            return stack2.pop();
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
