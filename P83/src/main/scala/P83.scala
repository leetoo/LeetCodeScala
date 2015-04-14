object P83
{
    def deleteDuplicates(list: Option[ListNode]): Option[ListNode] = 
    {
        list match 
        {
            case None => None
            case Some(ListNode(x, None)) => Some(ListNode(x, None))
            case Some(ListNode(x, next)) =>
                if (x == next.get.Value)
                    deleteDuplicates(next)
                else
                    Some(ListNode(x, deleteDuplicates(next)))
        }
    }
}
