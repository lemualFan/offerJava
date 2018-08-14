package 算法.Sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {3,2,4,5,1,3,5,76,7,3,3,6,4,3};
        BubbleSort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void BubbleSort(int[] a){
        int temp = 0;
        for(int i = a.length-1;i>0;--i){
            for(int j = 0;j<i;++j){
                if(a[j+1]<a[j]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
