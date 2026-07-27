//k smallest element using selection sort 
// in main method just print arr[k-1] rest code is same 
import java.util.*;
public class kth_smallest {
    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={9,4,7,1,5,2};
        int k=3;
        SelectionSort(arr);
        System.out.println("Sorted array"+Arrays.toString(arr));
        System.out.println(k+" smallest element "+arr[k-1]);
    }
}

