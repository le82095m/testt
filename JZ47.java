package jz;

public class JZ47 {
    public int Sum_Solution(int n) {
        if(n <= 1){
            return n;
        }
        return n+Sum_Solution(n-1);
    }
}
