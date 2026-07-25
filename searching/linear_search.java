//Finding an element using Linear Search 
//time compl=O(n) as we traverse the whole array for the worst case 
//In this case simply the index of the element is returned and if not then -1
class linear_search{
static int l_search(int[] arr,int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
}


public static void main(String[] args) {
    int[] arr={20,30,50,33,75,65};
    int target=33;
    System.out.println(l_search(arr, target));

}
}