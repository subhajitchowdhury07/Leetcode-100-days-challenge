/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int size(ListNode head){
        int count=0;
        ListNode curr =head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public int[] nextLargerNodes(ListNode head) {
        int size = size(head);
        int arr[] = new int[size];

        ListNode newHead =reverse(head);
        // ListNode curr =newHead.next;
        Stack<Integer> st = new Stack<>();
        st.push(newHead.val);

        ListNode curr = newHead.next;
        int ptr= size-2;
        while(ptr>=0){
            int ele =curr.val;
            curr = curr.next;
            
            //check & pop   
            while(st.size()> 0 && st.peek()<=ele){
                st.pop();
            }

            // push to the array
            if(st.size()== 0){
                arr[ptr] = 0;
            }else{
                arr[ptr] = st.peek();
            }
            //push into the stack

            st.push(ele);
            ptr--;

            
        }

        return arr;
    }
}