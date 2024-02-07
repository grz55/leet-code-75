package pl.grz55.linked_list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void shouldSuccessOnCorrectOutput() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        ListNode element2 = new ListNode(2);
        ListNode element3 = new ListNode(3);
        ListNode element4 = new ListNode(4);
        ListNode element5 = new ListNode(5);

        head.next = element2;
        element2.next = element3;
        element3.next = element4;
        element4.next = element5;

        List<Integer> expectedReversedHashCodes = new ArrayList<>();
        expectedReversedHashCodes.add(element5.hashCode());
        expectedReversedHashCodes.add(element4.hashCode());
        expectedReversedHashCodes.add(element3.hashCode());
        expectedReversedHashCodes.add(element2.hashCode());
        expectedReversedHashCodes.add(head.hashCode());

        ListNode reversedList = reverseLinkedList.reverseList(head);

        List<Integer> hashCodesAfterReverse = toHashCodesList(reversedList);

        assertEquals(expectedReversedHashCodes, hashCodesAfterReverse);
    }

    @Test
    void shouldFailOnIncorrectOutput() {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        ListNode element2 = new ListNode(2);
        ListNode element3 = new ListNode(3);
        ListNode element4 = new ListNode(4);
        ListNode element5 = new ListNode(5);

        // BROKEN ORDER
        head.next = element3;
        element3.next = element2;
        element2.next = element4;
        element4.next = element5;

        List<Integer> expectedReversedHashCodes = new ArrayList<>();
        expectedReversedHashCodes.add(element5.hashCode());
        expectedReversedHashCodes.add(element4.hashCode());
        expectedReversedHashCodes.add(element3.hashCode());
        expectedReversedHashCodes.add(element2.hashCode());
        expectedReversedHashCodes.add(head.hashCode());

        ListNode reversedList = reverseLinkedList.reverseList(head);

        List<Integer> hashCodesAfterReverse = toHashCodesList(reversedList);

        assertNotEquals(expectedReversedHashCodes, hashCodesAfterReverse);
    }

    private List<Integer> toHashCodesList(ListNode head) {
        List<Integer> hashCodesList = new ArrayList<>();
        ListNode currentListNode = head;
        while (currentListNode.next != null) {
            hashCodesList.add(currentListNode.hashCode());
            currentListNode = currentListNode.next;
        }
        hashCodesList.add(currentListNode.hashCode());
        return hashCodesList;
    }
}
