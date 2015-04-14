object P169
{
    def majorityElement(num: Array[Int]): Int = 
    {
        var m = 0
        var count = 0

        for (n <- num)
        {
            if (count == 0)
            {
                m = n
                count = count + 1
            }
            else if (m != n)
                count = count - 1
            else
                count = count + 1
        }

        return m
    }
}
