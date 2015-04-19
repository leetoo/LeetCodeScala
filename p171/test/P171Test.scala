import org.scalatest._

class P171Suite extends Suite
{
    def testSingle()
    {
        assert(P171.titleToNumber("Z") == 26)
    }
}
