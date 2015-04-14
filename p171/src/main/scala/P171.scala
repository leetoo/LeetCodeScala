object P171
{
    private val weights =
    {
        val assocs = 
            for
            {
                c <- 'A' to 'Z'
            } yield c -> (c - 'A' + 1) 

        assocs.toMap
    }

    def titleToNumber(s: String): Int =
    {
        if (s.length == 0) 0
        else weights(s takeRight 1 charAt 0) + 26 * titleToNumber(s dropRight 1)
    }
}
