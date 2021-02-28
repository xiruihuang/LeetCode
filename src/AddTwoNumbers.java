
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Assumption:
 * 1. Input Linked List is not null
 * 2. Each node only contain single digits
 * 3. Number store as reverse order
 * 4. no leading zero in numbers
 */

public class AddTwoNumbers {

    /*
     * Time Complexity:
     * Since we loop scan both 2 linked list, and for each nodes in the linked list, we do O(1) calculation
     * The total time will be O(m + n) which m is the length of input l1 and n is the length of input l2
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHeadL1 = l1;
        ListNode dummyHeadL2 = l2;
        int carry = 0;

        ListNode result = new ListNode();
        ListNode dummyHeadResult = result;

        // calculate when l1 and l2 both have digits
        while (dummyHeadL1 != null && dummyHeadL2 != null) {
            int resultNumber = carry + (dummyHeadL1.val + dummyHeadL2.val);
            int resultDigit = resultNumber % 10;
            carry = resultNumber / 10;

            result.next = new ListNode(resultDigit);
            result = result.next;

            dummyHeadL1 = dummyHeadL1.next;
            dummyHeadL2 = dummyHeadL2.next;
        }

        // move l1 extra digits to result
        while (dummyHeadL1 != null) {
            int resultNumber = carry + (dummyHeadL1.val);
            int resultDigit = resultNumber % 10;
            carry = resultNumber / 10;

            result.next = new ListNode(resultDigit);
            result = result.next;
            dummyHeadL1 = dummyHeadL1.next;
        }

        // move l2 extra digit to result
        while (dummyHeadL2 != null) {
            int resultNumber = carry + (dummyHeadL2.val);
            int resultDigit = resultNumber % 10;
            carry = resultNumber / 10;

            result.next = new ListNode(resultDigit);
            result = result.next;
            dummyHeadL2 = dummyHeadL2.next;
        }

        // move extra carry to result
        // largest carry => 1: (9 + 9) / 10
        if (carry != 0) {
            result.next = new ListNode(carry);
        }

        return dummyHeadResult.next;
    }


    /*
     * Improvement: Can combine the loop scan into one loop
     * no need to distinguish if l1 is longer or l2 is longer
     */

    public ListNode addTwoNumbersImproved(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode dummyHeadL1 = l1;
        ListNode dummyHeadL2 = l2;
        ListNode dummyHeadResult = result;
        int carry = 0;

        //calculation
        while (dummyHeadL1 != null || dummyHeadL2 != null) {
            int l1Val = (dummyHeadL1 != null) ? dummyHeadL1.val : 0;
            int l2Val = (dummyHeadL2 != null) ? dummyHeadL2.val : 0;

            int sum = carry + l1Val + l2Val;
            int resultDigit = sum % 10;
            carry = sum / 10;

            dummyHeadResult.next = new ListNode(resultDigit);
            dummyHeadResult = dummyHeadResult.next;

            if (dummyHeadL1 != null) {
                dummyHeadL1 = dummyHeadL1.next;
            }
            if (dummyHeadL2 != null) {
                dummyHeadL2 = dummyHeadL2.next;
            }
        }

        // move extra carry to result
        // largest carry => 1: (9 + 9) / 10
        if (carry > 0) {
            dummyHeadResult.next = new ListNode(carry);
        }
        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}