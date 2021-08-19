package jz;

public class JZ43 {
    /**
     *
     * 汇编语言中有一种移位指令叫做循环左移（ROL），
     * 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
     * 对于一个给定的字符序列 S，请你把其循环左移 K 位后的序列输出
     *
     * */
    public String LeftRotateString(String str,int n) {
        if(n > str.length()){
            return "";
        }
        StringBuffer sb = new StringBuffer(str);
        String s = sb.substring(0,n);
        sb.delete(0,n);
        sb.append(s);
        return sb.toString();
    }
}
