import org.scalatest.Suite

class P83Suite extends Suite
{
    def testSingleValue()
    {
        val list = Some(ListNode(
                    1, 
                    Some(ListNode(
                            1, 
                            Some(ListNode(
                                1, 
                                None))))))

        val result = P83.deleteDuplicates(list)

        assert(result.nonEmpty)
        assert(result.get.Value == 1)
        assert(result.get.Next.isEmpty)
    }

    def testMultipleValue()
    {
        val list = Some(ListNode(
                    1, 
                    Some(ListNode(
                            1, 
                            Some(ListNode(
                                2, 
                                Some(ListNode(
                                    3,
                                    Some(ListNode(
                                        3,
                                        None))))))))))

        val result = P83.deleteDuplicates(list)

        assert(result.nonEmpty)
        assert(result.get.Value == 1)

        val second = result.get.Next
        assert(second.nonEmpty)
        assert(second.get.Value == 2)

        val third = second.get.Next
        assert(third.nonEmpty)
        assert(third.get.Value == 3)
        assert(third.get.Next.isEmpty)
    }

}
