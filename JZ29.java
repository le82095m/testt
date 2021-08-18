package jz;

import java.util.ArrayList;

public class JZ29 {
    /**
     *
     * 给定一个数组，找出其中最小的K个数。
     * 例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
     *
     * */

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        buildHeap(input,k);

        for(int i = k; i < input.length; i++){
            if(input[i] >= input[0]){
                continue;
            }else{
                swap(input,0,i);
                shift(input,k,0);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < k; i++){
            list.add(input[i]);
        }
        return list;
    }

    public static void buildHeap(int[] array,int size){
        for(int i = (size-1-1)/2; i >= 0; i--){
            shift(array,size,i);
        }
    }

    public static void shift(int[] array,int size,int index){
        int left = index * 2 + 1;
        while(left < size){
            int right = left + 1;
            int max = left;

            if(right < size){
                max = array[left] > array[right] ? left : right;
            }

            if(array[max] < array[index]){
                break;
            }

            swap(array,max,index);
            index = max;
            left = index * 2 + 1;
        }
    }

    public static void swap(int[] array,int i ,int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
