package EasyProblems.day8;

import java.util.ArrayList;
import java.util.Stack;

public class PalindromeLinkedList {


//      Definition for singly-linked list.
      static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


        public boolean isPalindrome(ListNode head) {
            Stack<Integer> arr = new Stack<Integer>();
            ListNode curr = head;

            while(curr != null){
                arr.push(curr.val);
                curr = curr.next;
            }

            curr = head;

            while(curr != null){
                if(curr.val == arr.pop()) {
                    curr = curr.next;
                    continue;
                }

                return false;
            }
            return true;
        }


        public static void main(String[] args) {
//          ListNode head1 = new ListNode(1, new ListNode(2,
//                  new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))));
//            ListNode head1 = new ListNode(1);
            ListNode head1 = new ListNode(1,new ListNode(2, new ListNode(1)));
            PalindromeLinkedList demo = new PalindromeLinkedList();
            System.out.println(demo.isPalindrome(head1));
        }
}
