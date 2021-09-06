public class Test {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{};

        int[] array = function(arr1,arr2);
        for(int i : array){
            System.out.print(i+" ");
        }
    }
    public static int[] function(int[] arr1,int[] arr2){
        int[] newArray = new int [arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                newArray[index++] = arr1[i++];
            }else{
                newArray[index++] = arr2[j++];
            }
        }

        while(i < arr1.length){
            newArray[index++] = arr1[i++];
        }
        while(j < arr2.length){
            newArray[index++] = arr2[j++];
        }
        return newArray;
    }
}
