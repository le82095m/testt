package jz;

import java.util.HashMap;
import java.util.Map;

public class JZ33 {
    /**
     *
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)
     * 中找到第一个只出现一次的字符,并返回它的位置,
     * 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
     *
     * */

    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            int count = map.getOrDefault(c,0);
            map.put(c,++count);
        }
        for(char c : str.toCharArray()){
            if(map.get(c) == 1){
                return str.indexOf(c);
            }
        }
        return -1;
    }
}
