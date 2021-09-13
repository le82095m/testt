import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(maxCount("hello wold"));
    }

    public static String maxCount(String text){
        String str = text.trim();
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            int count = map.getOrDefault(c,0);
            map.put(c,++count);
        }
        char c = 'A';
        int count = 0;
        for(char i = 'A'; i <= 'z' ; i++){
            int num = map.getOrDefault(i,0);
            if(num > count){
                c = i;
                count = num;
            }
        }
        return c+" "+count;
    }
}
