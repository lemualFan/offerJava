package 算法.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {12,36,24,85,47,30,53,91};
        HeadSort(a);
        //System.out.println(Arrays.toString(a));
    }

    public static void SimpleSelectionSort(int[] a){
        int minKey = 0;
        for(int i = 0;i<a.length;i++){
            minKey = i;
            for(int j=i+1;j<a.length;j++){
                if(a[minKey]>a[j]){
                    minKey = j;
                }
            }
            if(minKey!=i){
                int temp = a[i];
                a[i] = a[minKey];
                a[minKey] = temp;
            }

        }
    }


    public  static void HeadSort(int[] arr){
        //1.构建大堆
        for(int i = arr.length/2 -1 ;i>=0;i--){
            //从第一个非叶子节点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
            System.out.println(Arrays.toString(arr));

        }

        //2.调整堆结构并且交换堆顶元素与末尾元素
        for(int j = arr.length-1;j>0;j--){
            swap(arr,0,j); //将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);
            //System.out.println(Arrays.toString(arr));
        }
    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已经构建的基础上）
     * @param arr
     * @param i
     * @param length
     */
    public  static  void adjustHeap(int[] arr,int i,int length){
        int temp = arr[i]; //先取出当前元素
        for(int k = 2*i+1;k<length;k=k*2+1){  //从i结点的左子节点开始
            if(k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[k]>temp){ //如果子节点大于父节点，将子节点赋值给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }

    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */

    public static void swap(int[] arr,int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
