package jz;

public class JZ49 {
    /**
     *
     * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
     * 数值为0或者字符串不是一个合法的数值则返回0
     *
     * */
    public int StrToInt(String str) {
        int res = 0;
        boolean isPuls = true;
        for(char c : str.toCharArray()){
            if((c <= '0' || c >= '9') && c != '+' && c != '-'){
                return 0;
            }
            if(c == '+'){
                continue;
            }else if(c == '-'){
                isPuls = false;
            }else{
                int num = c - '0';
                res = res * 10 + num;
            }
        }
        if(!isPuls){
            res = -res;
        }
        return res;
    }
}
