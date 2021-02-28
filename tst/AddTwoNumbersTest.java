import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AddTwoNumbersTest {

    AddTwoNumbers testInstance = new AddTwoNumbers();


    @Test
    void addTwoNumbers_GIVEN_SecondInputAs0() {
        //input 1
        ListNode inputList1 = new ListNode(0);
        inputList1.next = new ListNode(7);
        inputList1.next.next = new ListNode(4);
        inputList1.next.next.next = new ListNode(4);

        // input 2
        ListNode inputList2 = new ListNode(0);

        ListNode result = testInstance.addTwoNumbers(inputList1, inputList2);

        Assertions.assertTrue(assertEquals(result, inputList1));
    }

    @Test
    void addTwoNumbers_GIVEN_NormalInput() {
        //input 1
        ListNode inputList1 = new ListNode(0);
        inputList1.next = new ListNode(7);
        inputList1.next.next = new ListNode(4);
        inputList1.next.next.next = new ListNode(4);

        // input 2
        ListNode inputList2 = new ListNode(0);
        inputList2.next = new ListNode(7);
        inputList2.next.next = new ListNode(4);

        ListNode expected = new ListNode(0);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(9);
        expected.next.next.next = new ListNode(4);


        ListNode result = testInstance.addTwoNumbers(inputList1, inputList2);

        Assertions.assertTrue(assertEquals(result, expected));

    }


    @Test
    void addTwoNumbers_GIVEN_FinalExtraDigits() {
        //input 1
        ListNode inputList1 = new ListNode(9);
        inputList1.next = new ListNode(9);
        inputList1.next.next = new ListNode(9);
        inputList1.next.next.next = new ListNode(9);
        inputList1.next.next.next.next = new ListNode(9);
        inputList1.next.next.next.next.next = new ListNode(9);

        // input 2
        ListNode inputList2 = new ListNode(9);
        inputList2.next = new ListNode(9);
        inputList2.next.next = new ListNode(9);

        ListNode expected = new ListNode(8);
        expected.next = new ListNode(9);
        expected.next.next = new ListNode(9);
        expected.next.next.next = new ListNode(0);
        expected.next.next.next.next = new ListNode(0);
        expected.next.next.next.next.next = new ListNode(0);
        expected.next.next.next.next.next.next = new ListNode(1);


        ListNode result = testInstance.addTwoNumbers(inputList1, inputList2);

        Assertions.assertTrue(assertEquals(result, expected));
    }

    @Test
    void addTwoNumbersImproved_GIVEN_SecondInputAs0() {
        //input 1
        ListNode inputList1 = new ListNode(0);
        inputList1.next = new ListNode(7);
        inputList1.next.next = new ListNode(4);
        inputList1.next.next.next = new ListNode(4);

        // input 2
        ListNode inputList2 = new ListNode(0);

        ListNode result = testInstance.addTwoNumbersImproved(inputList1, inputList2);

        Assertions.assertTrue(assertEquals(result, inputList1));
    }

    @Test
    void addTwoNumbersImproved_GIVEN_NormalInput() {
        //input 1
        ListNode inputList1 = new ListNode(0);
        inputList1.next = new ListNode(7);
        inputList1.next.next = new ListNode(4);
        inputList1.next.next.next = new ListNode(4);

        // input 2
        ListNode inputList2 = new ListNode(0);
        inputList2.next = new ListNode(7);
        inputList2.next.next = new ListNode(4);

        ListNode expected = new ListNode(0);
        expected.next = new ListNode(4);
        expected.next.next = new ListNode(9);
        expected.next.next.next = new ListNode(4);


        ListNode result = testInstance.addTwoNumbersImproved(inputList1, inputList2);

        Assertions.assertTrue(assertEquals(result, expected));

    }


    @Test
    void addTwoNumbersImproved_GIVEN_FinalExtraDigits() {
        //input 1
        ListNode inputList1 = new ListNode(9);
        inputList1.next = new ListNode(9);
        inputList1.next.next = new ListNode(9);
        inputList1.next.next.next = new ListNode(9);
        inputList1.next.next.next.next = new ListNode(9);
        inputList1.next.next.next.next.next = new ListNode(9);

        // input 2
        ListNode inputList2 = new ListNode(9);
        inputList2.next = new ListNode(9);
        inputList2.next.next = new ListNode(9);

        ListNode expected = new ListNode(8);
        expected.next = new ListNode(9);
        expected.next.next = new ListNode(9);
        expected.next.next.next = new ListNode(0);
        expected.next.next.next.next = new ListNode(0);
        expected.next.next.next.next.next = new ListNode(0);
        expected.next.next.next.next.next.next = new ListNode(1);


        ListNode result = testInstance.addTwoNumbersImproved(inputList1, inputList2);

        Assertions.assertTrue(assertEquals(result, expected));
    }

    private boolean assertEquals(ListNode l1, ListNode l2) {

        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) {
            return false;
        }
        if (l2 != null) {
            return false;
        }

        return true;
    }

    private void printLinkedList(ListNode l1) {
        while (l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}