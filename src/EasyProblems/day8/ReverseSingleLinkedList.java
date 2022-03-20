package EasyProblems.day8;

public class ReverseSingleLinkedList {
    /**
     *  PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
     *  STATUS: ACCEPTED
     *  HELP ? YES
     *  NUM OF SUBMISSIONS ? 2
     *
     *  TRICK LEARNED FROM IT: how to manipulate a single linked list to make each node point to the previous one
     *  by using two pointers
     */

//    Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}

        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}


        public static ListNode reverseList(ListNode head) {

            if(head == null || head.next == null) return head;

            ListNode curr1 = null;
            ListNode curr2 = head;

            while(curr2.next != null){

                ListNode curr2Next = curr2.next;
                curr2.next = curr1;
                curr1 = curr2;
                curr2 = curr2Next;
            }

            curr2.next = curr1;

            return curr2;
        }


    public static void main(String[] args) {
//        ListNode head =
//                new ListNode(1,
//                        new ListNode(2,
//                                new ListNode(3,
//                                        new ListNode(4))));

        ListNode head = null;
        System.out.println(reverseList(head));
    }
}
