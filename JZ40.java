package jz;

import java.util.HashMap;
import java.util.Map;

public class JZ40 {
    /**
     *
     * 一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。
     * 请写程序找出这两个只出现一次的数字。
     *
     * */
    public int[] FindNumsAppearOnce (int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : array){
            int count = map.getOrDefault(a,0);
            map.put(a,++count);
        }
        int[] arr = new int[2];
        int index = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                arr[index++] = key;
            }
        }
        return arr;
    }
}
