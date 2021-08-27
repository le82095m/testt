public class JZ1_0827 {
    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array.length-1;

        if(array.length == 0 || array[0].length == 0){
            return false;
        }

        while(j >= 0 && i < array[0].length){
            if(target == array[j][i]){
                return true;
            }else if(target > array[j][i]){
                i++;
            }else{
                j--;
            }
        }

        return false;
    }
}
