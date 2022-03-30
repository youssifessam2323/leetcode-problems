package EasyProblems.day9;

public class LinkedListCycle {

    /**
     * PROBLEM LINK: https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
     * STATUS: ACCEPTED
     * HELP ? NO
     * NUM OF SUBMISSIONS ? 1
     * TRICK LEARNED FROM IT? Yes,
     * We can use the fast and slow pointer technique to found the cycle as we can check if the slow pointer at
     * some point will be equal to the fast pointer, as the fast moving twice the time the slow move so after
     * some time if there is no cycle the fast will be set to null, and if the a cycle exist the fast after some iteration
     * will go back and reach a point at which it will be equal the slow one so we can know from this behavior
     * that there is a cycle
     */

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        ListNode fast = head, slow = head;

        if (head == null) return false;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;

        }
        return false;

    }
}