object P21
{
    def mergeTwoLists(l1: Option[ListNode], l2: Option[ListNode]): Option[ListNode] =
        (l1, l2) match 
        {
            case (None, None) => None
            case (l1, None) => l1
            case (None, l2) => l2
            case (Some(ListNode(n1, next1)), Some(ListNode(n2, next2))) =>
                if (n1 <= n2)
                    Some(ListNode(n1, Some(ListNode(n2, mergeTwoLists(next1, next2)))))
                else
                    Some(ListNode(n2, Some(ListNode(n1, mergeTwoLists(next1, next2)))))
        }
}
