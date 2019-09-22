package passed;

/**
 * @Author: yk
 * @Date: 2019/9/6 16:33
 */
public class L2_addTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = new ListNode(0);
        ListNode currentNode = firstNode;
        firstNode.next = currentNode;
        int num = 0;
        int value = 0;
        while (l1 != null || l2 != null || num != 0) {
            if (l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }
            if (value >= 10) {
                num += value / 10;
                value %= 10;
            }
            currentNode.next = new ListNode(value);
            currentNode = currentNode.next;
            value = num;
            num = 0;
        }

        return firstNode.next;
    }
}
