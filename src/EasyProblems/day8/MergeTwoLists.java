package EasyProblems.day8;

public class MergeTwoLists {
    public static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode resHead = new ListNode(0);
            ListNode curr = resHead;

            while(l1 != null && l2 != null){
                if(l1.val < l2.val) {
                    curr.next = l1;
                    l1 = l1.next;
                }else {
                    curr.next = l2;
                    l2 = l2.next;
                }
                curr = curr.next;
            }

            if(l1 != null) {
                curr.next = l1;
                l1 = l1. next;
                return resHead.next;
            }

            if(l2 != null) {
                curr.next  =l2;
                l2 = l2.next;
                return resHead.next;
            }

            return resHead.next;
        }

    public static void main(String[] args) {
        MergeTwoLists demo  = new MergeTwoLists();
        ListNode head1 = new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4))));
        ListNode head2 = new ListNode(1, new ListNode(5, new ListNode(6)));

        System.out.println(demo.mergeTwoLists(head1, head2));
    }
}
