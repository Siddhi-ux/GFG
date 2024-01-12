public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        //Array to store k numbers in reverse Order.
        int[] nums = new int[k];
        //populate the array with nums
        while( k--> 0) {
           nums[k] = q.poll();
        }
       
        //get the size - k elements that has to be queued back. 
        int itemsToShift = q.size();
        //add the reversed item to queue.
        for(int e : nums) q.add(e);
        
        //Shift size -k elements back.
        while(itemsToShift-->0) {
           q.add(q.poll());
        }
        return q;
    }
