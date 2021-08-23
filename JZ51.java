package jz;

public class JZ51 {
    /**
     *
     * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
     * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
     *（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
     * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
     *
     * */
    public int[] multiply(int[] A) {
        int num = 1;
        int zeroSize = 0;
        for(int a : A){
            if(a != 0){
                num *= a;
            }else{
                zeroSize++;
            }
        }

        int[] arr = new int[A.length];
        if(zeroSize > 1){
            return arr;
        }
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                arr[i] = num;
            }else{
                if(zeroSize > 0){
                    arr[i] = 0;
                }else{
                    arr[i] = num/A[i];
                }
            }
        }

        return arr;
    }
}
