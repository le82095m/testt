import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length < 3){
            return list;
        }

        for(int i = 0; i < nums.length-2; i++){
            if(nums[i] > 0){
                break;
            }

            int num = -nums[i];
            int left = i+1;
            int right = nums.length-1;

            while (left < right ){
                if(nums[left] + nums[right] == num) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }else if(nums[left] + nums[right] > num){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return list;
    }

    public static int[] function(int[] arr,int t){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(t-arr[i],i);
        }
        int[] nums = new int[2];
        for(int i = 0; i < arr.length; i++){
            int index = map.getOrDefault(arr[i],-1);
            if(index != -1 && index != i){
                nums[0] = Math.min(arr[i],arr[index]);
                nums[1] = Math.max(arr[i],arr[index]);
            }
        }
        return nums;
    }
}
