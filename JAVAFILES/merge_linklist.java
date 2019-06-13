Node MergeLists(Node headA, Node headB) {
    if (headA != null && headB != null) {
        if (headA.data < headB.data) {
            headA.next = MergeLists(headA.next, headB);            
            return headA;
        } else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }
    } else if (headA != null) {
        return headA;
    } else {
        return headB;
    }   
}