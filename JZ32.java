package jz;

import java.util.Arrays;
import java.util.Comparator;

public class JZ32 {
    /**
     *
     * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
     * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
     * 则打印出这三个数字能排成的最小数字为321323。
     *
     * */

    public String PrintMinNumber(int [] numbers) {
        String[] strings = new String[numbers.length];
        int index = 0;
        for(int i : numbers){
            strings[index++] = i+"";
        }
        Arrays.sort(strings,new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
                int index = 0;
                if(o1.length() < o2.length()){
                    while(index < o1.length()){
                        if(o1.charAt(index) != o2.charAt(index)){
                            return o1.charAt(index)-o2.charAt(index);
                        }else{
                            index++;
                        }
                    }
                    for(int i = index;i < o2.length(); i++){
                        if(o1.charAt(0) != o2.charAt(i)){
                            return o1.charAt(0)-o2.charAt(i);
                        }
                    }
                    return 0;
                }else if(o2.length() < o1.length()){
                    while(index < o2.length()){
                        if(o1.charAt(index) != o2.charAt(index)){
                            return o1.charAt(index)-o2.charAt(index);
                        }else{
                            index++;
                        }
                    }
                    for(int i = index;i < o1.length(); i++){
                        if(o1.charAt(i) != o2.charAt(0)){
                            return o1.charAt(i)-o2.charAt(0);
                        }
                    }
                    return 0;
                }else{
                    while(index < o2.length()){
                        if(o1.charAt(index) != o2.charAt(index)){
                            return o1.charAt(index)-o2.charAt(index);
                        }else{
                            index++;
                        }
                    }
                    return 0;
                }
            }
        });

        StringBuffer sb = new StringBuffer();
        for(String s : strings){
            sb.append(s);
        }
        return sb.toString();
    }
}
