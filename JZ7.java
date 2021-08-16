public class JZ7 {

    /**
     *
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项
     *
     * */

    public int Fibonacci(int n) {
        //方法一，递归
//        if(n < 2){
//            return n;
//        }
//        return Fibonacci(n-1) + Fibonacci(n-2);
        //方法二，遍历
        int a = 0;
        int b = 1;
        int c = 1;

        while(n > 2){
            a = b + c;
            b = c + a;
            c = a + b;
            n -= 3;
        }

        switch(n % 3){
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            default :
                return 0;
        }
    }
}
