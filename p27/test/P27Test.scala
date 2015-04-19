import org.scalatest._

class P27Suite extends Suite
{
    def testGeneric()
    {
        assert(P27.removeElement(Array(3, 4, 1, 2, 5, 1, 1, 5, 6, 7, 9, 10, 3), 3) == 11)
    }

    def testSingle()
    {
        assert(P27.removeElement(Array(3, 3, 3, 3, 3, 3, 3), 3) == 0)
    }
}
