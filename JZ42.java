package jz;

import java.util.ArrayList;

public class JZ42 {
    /**
     *
     * 输入一个递增排序的数组和一个数字S，
     * 在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，
     * 返回两个数的乘积最小的，如果无法找出这样的数字，返回一个空数组即可。
     *
     * */
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0;
        int right = array.length-1;
        while(left < right){
            if(array[left] + array[right] < sum){
                left++;
            }else if(array[left] + array[right] > sum){
                right--;
            }else{
                list.add(array[left]);
                list.add(array[right]);
                break;
            }
        }
        return list;
    }
}
