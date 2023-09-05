#java
class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        PriorityQueue<Integer> minHeap =new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.offer(arr[i]);
        }
        for(int i=k;i <n;i++){
            int curr=arr[i];
            if(curr>minHeap.peek()){
                minHeap.poll();
                minHeap.offer(curr);
            }
        }
        ArrayList<Integer> res =new ArrayList<>();
        while(!minHeap.isEmpty()){
            res.add(0,minHeap.poll());
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        ArrayList<Integer> kLargestElements = kLargest(arr, n, k);
    }
}
