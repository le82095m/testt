package jz;

import java.util.LinkedHashMap;
import java.util.Map;

public class JZ52 {
    /**
     *
     * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
     * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
     * 后台会用以下方式调用Insert 和 FirstAppearingOnce 函数
     *
     * */

    StringBuilder sb = new StringBuilder();
    Map<Character,Integer> map = new LinkedHashMap<>();
    //Insert one char from stringStream
    public void Insert(char ch){
        sb.append(ch);
        int count = map.getOrDefault(ch,0);
        map.put(ch,++count);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
        for(char c : map.keySet()){
            if(map.get(c) == 1){
                return c;
            }
        }
        return '#';
    }
}
