import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }
        int left = 0;
        int right = values.size() - 1;
        while (left < right) {
            if (!values.get(left).equals(values.get(right))) {
                return false; 
            }
            left++;
            right--; 
        }
        
        return true; 
    }
}
