class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
                Node fast = head;

                // Detect the loop
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;

                    if (slow == fast) {
                        break;
                    }
                }

                // No loop exists
                if (fast == null || fast.next == null) {
                    return;
                }

                // Find the starting point of the loop
                slow = head;

                if (slow == fast) {
                    while (fast.next != slow) {
                        fast = fast.next;
                    }
                    fast.next = null;
                    return;
                }

                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Remove the loop
                fast.next = null;
        
    }
}