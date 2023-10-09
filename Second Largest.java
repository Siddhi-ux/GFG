class Solution {
    int print2largest(int arr[], int n) {
        int first = Integer.MIN_VALUE;
        int sec =Integer.MIN_VALUE;
        if(n<2)
            
        return -1;
       
        for(int num : arr){
            if(num> first){
                sec = first;
                first = num;
            }else if(num> sec && num !=first){
                sec =num;
               
            }
           
        }
        if(sec == Integer.MIN_VALUE){
            return -1;
        }
       
        return sec;
    }
    
}
