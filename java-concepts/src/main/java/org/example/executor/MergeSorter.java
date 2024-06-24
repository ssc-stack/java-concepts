package org.example.executor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MergeSorter {
    public void sort(int[] array,int low,int high) {
        if(low>=high) return;
        int mid=low+(high-low)/2;
        sort(array,low,mid);
        sort(array,mid+1,high);
        merge(array,low,mid,high);
    }

    private static void merge(int[] arr,int low,int mid,int high) {
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high) {
            if(arr[left]<=arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid) {
            temp.add(arr[left]);
            left++;
        }

        while(right<=high) {
            temp.add(arr[right]);
            right++;
        }
        int k=0;
        for(int i=low;i<=high;++i) {
            arr[i]=temp.get(k++);
        }
    }
}
