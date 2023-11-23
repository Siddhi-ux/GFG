

class Solution {
    int transitionPoint(int arr[], int n) {
        int low=0;
        int high=n-1;
        int t=-1;
        while(low <= high){
            int mid =low+(high-low)/2;
            
            
            if(arr[mid]==1){
                t=mid;
                high=mid-1;
            }else{
                low= mid+1;
            }
        }
        return t;
    }
}
