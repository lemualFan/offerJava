package _1offer1._64_数据流中的中位数;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class Solution {

    int count = 0;
    ArrayList<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        list.add(num);
        count++;
    }
    public Double GetMedian() {
        if(count==0) return null;
        Collections.sort(list);
        double res = 0;
        if (count%2==0){
            res = (list.get((count/2) - 1)+list.get((count/2)))/2.00;
        }else {
            res = list.get(count/2);
        }

        return res;
    }
}
