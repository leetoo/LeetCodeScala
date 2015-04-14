object P191
{
    def hammingWeight(n: Int): Int =
    {
        if (n == 0) 0
        else 1 + hammingWeight(n & (n - 1))
    }
}
