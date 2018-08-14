package 算法.Sort;

import java.util.Arrays;

public class HeadSort {

    public static void main(String[] args) {
        int[] a = {12,36,24,85,47,30,53,91};
        HeadSort(a);
        System.out.println(Arrays.toString(a));
    }





    public static void HeadSort(int arr[]){
        //构建初始堆
        for(int i = arr.length/2-1;i>=0;i--){
            adjustSort(arr,i,arr.length);
        }

        for(int i = arr.length -1;i>0;i--){
            swap(arr,0,i);
            adjustSort(arr,0,i);
        }
    }


    /**
     * 堆调整函数
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustSort(int[] arr,int i,int length){
        int temp = arr[i];
        for(int k=2*i+1;k<length;k=2*k+1){
            if(k+1<length&&arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }


    /**
     * 交换函数
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
