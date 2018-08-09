package Sort;

import java.util.Arrays;

public class MergeSort {
    public void Merge(int[] array,int[] temp,int start,int mid,int end){
        int i,j,k;
        i = start;
        j = mid+1;
        k = start;
        while (i<=mid&&j<=end){
            if(array[i]<array[j]){
                temp[k++] = array[i++];
            }else{
                temp[k++] = array[j++];
            }
        }
        while(i<=mid){
            temp[k++] = array[i++];
        }
        while(j<=end){
            temp[k++] = array[j++];
        }
        for(int s =start;s<=end;s++){
            array[s] = temp[s];
        }
    }

    public void MSort(int[] array,int[] temp,int start,int end){
        if(start<end){
            int mid = start+(end-start)/2;
            MSort(array,temp,0,mid);
            MSort(array,temp,mid+1,end);
            Merge(array,temp,start,mid,end);
        }

    }

    public int[] MergeSort(int[] array){
        if(array==null||array.length<0){
            return null;
        }
        int len = array.length;
        int[] temp = new int[len];
        MSort(array,temp,0,len-1);
        return  array;
    }

    public int[] MergeSortNorec(int[] array){
        if(array==null||array.length<0){
            return null;
        }
        int len = array.length;
        int[] temp = new int[len];
        int size = 1,low,mid,high;
        while (size<=len-1){
            low=0;
            while (low+size<=len-1){
                mid=low+size-1;
                high=mid+size;
                if(high>len-1){
                    high=len-1;
                }
                Merge(array,temp,low,mid,high);
                low=high+1;
            }
            size*=2;
        }
        return  array;
    }

}
