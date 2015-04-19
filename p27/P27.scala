object P27
{
    def removeElement(A: Array[Int], elem: Int): Int = 
        removeElementHelper(A, elem, 0, 0)

    private def removeElementHelper(A: Array[Int], elem: Int, i: Int, j: Int): Int = 
    {
        if (j >= A.length) 
            0
        else if (A(j) == elem)
            removeElementHelper(A, elem, i, j + 1)
        else
            1 + removeElementHelper(A, elem, i + 1, j + 1)
    }

}
