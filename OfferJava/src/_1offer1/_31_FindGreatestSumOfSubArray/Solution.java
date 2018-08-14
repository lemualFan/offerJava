package _1offer1._31_FindGreatestSumOfSubArray;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length<=0){
            return 0;
        }
        int len = array.length;
        int max = array[0];
        int sum = 0;
        for(int i = 0;i<len;i++){
            sum = 0;
            for(int j = i;j<len;j++){
                sum+= array[j];
                if(sum>max){
                    max= sum;
                }
            }
        }

        return max;
    }

    public int Solution2(int[] array){
        if(array.length<=0){
            return 0;
        }
        int len = array.length;
        int max = 0x80000000;
        int sum = 0;
        for(int i = 0;i<len;i++){
            if(sum<=0){
                sum = array[i];
            }else{
                sum+=array[i];
            }
            if(max<sum){
                max= sum;
            }
        }

        return max;
    }
}
