object P110
{
    def isBalanced(root: Option[TreeNode]): Boolean =
        getBalancedHeight(root) != -1

    private def getBalancedHeight(root: Option[TreeNode]): Int =
        root match
        {
            case None => 0
            case Some(TreeNode(n, left, right)) =>
                val l = getBalancedHeight(left)
                val r = getBalancedHeight(right)

                if (l == -1 || r == -1)
                    -1
                else if (math.abs(l - r) > 1)
                    -1
                else
                    (l max r) + 1
        }
}
