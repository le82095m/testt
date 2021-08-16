public class JZ10 {

    /**
     *
     * 给定一个double类型的浮点数base和int类型的整数exponent
     * 求base的exponent次方
     *
     * */

    public double Power(double base, int exponent) {
        double num = 1.0;
        if(exponent >= 0){
            for(int i = 0; i < exponent; i++){
                num *= base;
            }
        }else{
            for(int i = 0; i > exponent; i--){
                num /= base;
            }
        }
        return num;
    }
}
