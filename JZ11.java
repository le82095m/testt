package jz;

public class JZ11 {

    /**
     *
     * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
     *
     * */

    public int NumberOf1(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
