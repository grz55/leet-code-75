package pl.grz55.linked_list;

public class ReverseLinkedList {

    // https://leetcode.com/problems/reverse-linked-list/

    // Given the head of a singly linked list, reverse the list, and return the reversed list.
    // T O(n), M O(1)

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
