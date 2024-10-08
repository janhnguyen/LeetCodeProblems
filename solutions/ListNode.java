/*
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

        ListNode ans = new ListNode();
        ListNode curr = ans;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Compute the sum and carry
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // Move to the next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return ans.next;

    }
}