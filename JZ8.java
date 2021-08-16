public class JZ8 {

    /**
     *
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     *
     * */


//    public int jumpFloor(int target) {
//        if(target < 3){
//            return target;
//        }
//        return jumpFloor(target-1)+jumpFloor(target-2);
//    }
    public static void main(String[] args) {
        System.out.println(~3);
    }
    public static int JumpFloorII(int target) {
        if(target == 1){
            return 1;
        }
        return target-1+JumpFloorII(target-1);
    }
}
