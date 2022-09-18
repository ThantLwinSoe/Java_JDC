public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
}

// assign 456 
// ListNode l1 = new ListNode(4, new ListNode(5, new ListNode(6)))
// get value
// l1.val = 4
// l1.next.val = 5
// l1.next.next.val = 6

// assign 45 
// ListNode l1 = new ListNode(4, new ListNode(5))
// l1.val = 4
// l1.next.val = 5

/** The Second code by rois28 from Leetcode.com
 * Thanks brother
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 1;
        int carry = 0;
        ListNode resultNode = new ListNode();
        ListNode nextNode = resultNode;
        while(l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if(l1 != null){
               sum += l1.val;
                l1 = l1.next;
            } 
                
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            } 
            
            if(sum >9) {
                carry = 1;
                nextNode.val = sum - 10;
            } else {
                carry = 0;
                nextNode.val = sum;
            }
            if(l1 != null || l2 != null || carry != 0) {
                nextNode.next = new ListNode();
                nextNode = nextNode.next;
            }
        }
        return resultNode;
    }
}