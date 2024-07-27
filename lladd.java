class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Initialize a dummy head node
        ListNode current = dummyHead; // Initialize the current pointer
        int carry = 0; // Initialize carry to 0

        while (l1 != null || l2 != null) { // Loop until both l1 and l2 are null
            int x = (l1 != null) ? l1.val : 0; // Get the value from l1 if available, otherwise 0
            int y = (l2 != null) ? l2.val : 0; // Get the value from l2 if available, otherwise 0
            int sum = carry + x + y; // Calculate the sum of the values and the carry
            carry = sum / 10; // Update the carry
            current.next = new ListNode(sum % 10); // Create a new node with the digit (sum % 10)
            current = current.next; // Move the current pointer to the next node

            if (l1 != null) l1 = l1.next; // Move to the next node in l1 if available
            if (l2 != null) l2 = l2.next; // Move to the next node in l2 if available
        }

        if (carry > 0) { // If there's any carry left
            current.next = new ListNode(carry); // Create a new node with the carry
        }

        return dummyHead.next; // Return the result list starting from the node after dummy head
    }
}
