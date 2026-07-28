// 2418. Sort the People
// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.

// Example 1:

// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.


// bubble sort is used 
// swapping is done for both name and height 
// because we have to return the names sorted in desc order acc to the heights 

public class lc_2418_Sortpeople {
    
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length-i-1;j++){
                if(heights[j]<heights[j+1]){
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                    String temp1=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp1;
                }
            }
        }
        return names;
    }
}

