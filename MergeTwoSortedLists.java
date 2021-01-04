public class MergeTwoSortedLists {

    /*

    Merge two sorted linked lists and return it as a sorted list.
    The list should be made by splicing together the nodes of the first two lists.

    Input: l1 = [1,2,4], l2 = [1,3,4]
    Output: [1,1,2,3,4,4]

    Input: l1 = [], l2 = [0]
    Output: [0]

    */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        
        System.out.println("yunus emre");
        
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode temp=new ListNode(0);
        ListNode head=temp;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else {
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        temp.next =  (l1==null) ? l2 : l1;
        return head.next;
        
    }
}
