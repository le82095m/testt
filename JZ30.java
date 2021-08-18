package jz;

import java.util.HashMap;
import java.util.Map;

public class JZ30 {
    /**
     *
     * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数
     * 例如，1~13中包含1的数字有1、10、11、12、13因此共出现6次
     *
     * */

    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuffer sb = new StringBuffer();
        for(int i = 1 ; i <= n; i++){
            sb.append(i);
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char c : sb.toString().toCharArray()){
            int count = map.getOrDefault(c,0);
            map.put(c,++count);
        }
        return map.getOrDefault('1',0);
    }
}
