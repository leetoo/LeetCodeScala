object P70
{
    def climbStairs(n: Int): Int =
        n match
        {
            case x if(x <= 0) => 0
            case 1 => 1
            case 2 => 2
            case _ => climbStairs(n - 1) + climbStairs(n - 2)
        }
}
