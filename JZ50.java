package jz;

import java.util.HashMap;
import java.util.Map;

public class JZ50 {
    /**
     *
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
     * 数组中某些数字是重复的，但不知道有几个数字是重复的。
     * 也不知道每个数字重复几次。请找出数组中任一一个重复的数字。
     * 例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。
     * 存在不合法的输入的话输出-1
     *
     * */
    public int duplicate (int[] numbers) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : numbers){
            int count = map.getOrDefault(a,0);
            map.put(a,++count);
        }
        for(int key : map.keySet()){
            if(map.get(key) > 1){
                return key;
            }
        }
        return -1;
    }
}
