package jz;

import java.util.ArrayList;

public class JZ63 {
    /**
     *
     * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
     * 那么中位数就是所有数值排序之后位于中间的数值。
     * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
     * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
     *
     * */
    ArrayList<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        for(int i = 0; i < list.size(); i++){
            if(num < list.get(i)){
                list.add(i,num);
                return;
            }
        }
        list.add(num);
    }

    public Double GetMedian() {
        int size = list.size();
        if(size % 2 == 0){
            return ((double)list.get(size/2-1)+(double)list.get(size/2))/2;
        }else{
            return (double)list.get(size/2);
        }
    }
}
