class Solution {
    void reorderlist(Node head) {
        // Your code here
        if (head == null || head.next == null || head.next.next == null) return;
        ArrayList<Node> list = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int length = list.size();
        int i = 0;
        int j = length - 1;

        Node a = list.get(i);
        Node b = list.get(j);

        while (i <= j) {
            b = list.get(j);
            a.next = b;
            i++;
            a = list.get(i);
            b.next = a;
            j--;
        }
        
        if (i == j) { // Handle case where there's an odd number of nodes
            b.next = null;
        } else {
            b.next = null;
        }
    
    }
}
