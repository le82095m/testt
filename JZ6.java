public class JZ6 {

    /**
     *
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     *
     * */


    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;

        while(left < right){
            mid = (left + right) / 2;
            if(array[left] < array[right]){
                return array[left];
            }
            if(array[mid] < array[right]){
                right = mid;
            }else if(array[mid] > array[right]){
                left = mid + 1;
            }else{
                left++;
            }
        }
        return array[left];
    }
}
