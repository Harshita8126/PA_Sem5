//Find the target el using binary search .
// we calculate the mid and then compare it with target 
//time compl=O(log n)


public class binary_search {
    static int bS(int[] arr,int target){
         int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
            return -1;
        
    }
    public static void main(String[] args) {
        int[] arr={20,30,34,50,60,90};
        int target=34;
        System.out.println(bS(arr, target));
    }
}
