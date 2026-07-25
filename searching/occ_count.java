//In a sorted array task is to find the total number of times target occurs in the array.
// used last index-first index+1 to find it 


public class occ_count {
    static int Foccurence(int[]arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;

            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    static int lOccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4,5};
        int target=2;
        int first=Foccurence(arr,target);
        int last=lOccurence(arr,target);
        if(first==-1){
            System.out.println("el not found");
        }
        else{
            System.out.println("count="+(last-first+1));
        }
        

    }
}
