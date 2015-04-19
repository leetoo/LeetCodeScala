import org.scalatest._

class P110Suite extends Suite
{
    def testUnbalanced()
    {
        val tree = Some(TreeNode(1, Some(TreeNode(1, Some(TreeNode(1, Some(TreeNode(1, None, None)), None)), None)), None))
        assert(P110.isBalanced(tree) == false)
    }

    def testBalanced()
    {
        val tree = Some(TreeNode(1, Some(TreeNode(1, None, None)), None))
        assert(P110.isBalanced(tree) == true)
    }

}
