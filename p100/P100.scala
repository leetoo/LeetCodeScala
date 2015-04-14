object P100 
{
    def isSameTree(p: Option[TreeNode], q: Option[TreeNode]): Boolean =
        (p, q) match
        {
            case (None, None) => true
            case (Some(_), None) => false
            case (None, Some(_)) => false
            case (Some(TreeNode(x1, l1, r1)), Some(TreeNode(x2, l2, r2))) =>
                if (x1 == x2)
                    isSameTree(l1, l2) && isSameTree(r1, r2)
                else
                    false
        }
}
