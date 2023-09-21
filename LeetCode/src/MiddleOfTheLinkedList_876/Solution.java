package MiddleOfTheLinkedList_876;

import java.util.ArrayList;

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
    public static ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arr = new ArrayList<>();
        int number = 0;
        while (head != null) {
            arr.add(head);
            head = head.next;
            ++number;
        }
        return arr.get(number/2);
    }

    public static ListNode middleNode1(ListNode head) {
        ListNode middle = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        return middle;
    }

    public static void outAllNode(ListNode head) {
        int[] counter = new int[100];
        int number = 0;
        for (int i = 0; head != null; i++) {
            counter[i] = head.val;
            head = head.next;
            ++number;
        }
        int[] betweenResult = new int[number];
        for (int i = 0; i < betweenResult.length; i++) {
            betweenResult[i] = counter[i];
        }
        System.out.print("[ ");
        for (int i : betweenResult) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        ListNode ob1 = new ListNode(7);
        ListNode ob2 = new ListNode(6, ob1);
        ListNode ob3 = new ListNode(5, ob2);
        ListNode ob4 = new ListNode(4, ob3);
        ListNode ob5 = new ListNode(3, ob4);
        ListNode ob6 = new ListNode(2, ob5);
        ListNode ob7 = new ListNode(1, ob6);
        outAllNode(ob7);
        System.out.println();
        outAllNode(middleNode(ob7));
        System.out.println();
        outAllNode(middleNode1(ob7));

    }
}
