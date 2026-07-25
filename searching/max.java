//Finding max element using linear search 
//initialised first el as max then start from 1 to array length if any greater element is there return it

public class max {
    static int LinSearch(int[] arr){
        int maxel=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxel){
                maxel=arr[i];
            }
        }
        return maxel;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,5,6};
    System.out.println(LinSearch(arr));
    }
}
