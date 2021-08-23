package jz;

public class JZ48 {
    public int Add(int num1,int num2) {
        int count = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        int temp;
        while(carry != 0){
            temp = count;
            count = count ^ carry;
            carry = (carry & temp)<<1;
        }

        return count;
    }
}
