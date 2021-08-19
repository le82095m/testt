package jz;

public class JZ37 {
    /**
     *
     * 统计一个数字在升序数组中出现的次数。
     *
     * */

    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for(int a : array){
            if(a == k){
                count++;
            }else if(a > k){
                break;
            }
        }
        return count;
    }
}
