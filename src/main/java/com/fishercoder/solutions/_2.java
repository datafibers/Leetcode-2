package com.fishercoder.solutions;

import com.fishercoder.common.classes.ListNode;

import java.util.List;

/**
 * 2. Add Two Numbers

 You are given two linked lists representing two non-negative numbers.
 The digits are stored in reverse order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */

public class _2 {
    public static class Solution1 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode tmp = result;
            int sum = 0;
            while (l1 != null || l2 != null) {
                sum /= 10;
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }
                tmp.next = new ListNode(sum % 10);
                tmp = tmp.next;
            }
            if (sum / 10 == 1) {
                tmp.next = new ListNode(1);//this means there's a carry, so we add additional 1, e.g. [5] + [5] = [0, 1]
            }
            return result.val == 0 ? result.next : result;
        }
    }

    public static class Solution2 {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode c1 = l1;
            ListNode c2 = l2;
            ListNode c3 = new ListNode(0);
            ListNode head = c3;
            int carry = 0;
            while(c1 != null || c2 != null) {
                if(c1 != null) {
                    carry += c1.val;
                    c1 = c1.next;
                }
                if(c2 != null) {
                    carry += c2.val;
                    c2 = c2.next;
                }
                c3.next = new ListNode(carry % 10);
                carry = carry / 10;
                c3 = c3.next;
            }
            if (carry == 1)
                c3.next = new ListNode(1);//this means there's a carry, so we add additional 1, e.g. [5] + [5] = [0, 1]

            return head.val == 0 ? head.next : head;
        }
    }

}
