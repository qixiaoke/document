package No2;

/**
 * Created by qixin on 2017/9/21.
 */
public class No2 {
    public static void main(String[] args) {

        class Point {
            int a;
        }

        Point p1 = new Point();
        p1.a = 1;
        Point p9 = new Point();
        p9.a = 9;

        Point p2 = p1;
        p1 = p9;

        System.out.println(p1.a);
        System.out.println(p2.a);
        /**
         * Definition for singly-linked list.
         * public class ListNode {
         *     int val;
         *     ListNode next;
         *     ListNode(int x) { val = x; }
         * }
         */
        class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
        }

        class Solution {
            public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                ListNode result = new ListNode(0);
                while(l1 != null || l2 != null) {
                    int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
                    result.next = new ListNode(sum % 10);
                    l1 = l1.next;
                    l2 = l2.next;
                }
                return result;
            }
        }

//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(listNode1, listNode2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
