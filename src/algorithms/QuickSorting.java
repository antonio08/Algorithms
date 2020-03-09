package algorithms;

public class QuickSorting
{
    int [] mArrayToSort;

    public QuickSorting(int [] arrayToSort)
    {
        mArrayToSort = arrayToSort;
    }

    public int [] sort(final int lowIndex, final int highIndex)
    {
        int i = lowIndex;
        int j = highIndex;
        int pivotPosition = j;

        int pivotValue = mArrayToSort[pivotPosition];

        while (i <= j)
        {
            while (mArrayToSort[i] < pivotValue)
            {
                i++;
            }

            while (mArrayToSort[j] > pivotValue)
            {
                j--;
            }

            if (i <= j)
            {
                swapNumbers(i, j);
                i++;
                j--;
            }

            if (lowIndex < j)
            {
                sort(lowIndex, j);
            }

            if (i < highIndex)
            {
                sort(i, highIndex);
            }
        }

        return mArrayToSort;
    }

    private void swapNumbers(final int lowIndex, final int highIndex)
    {
        final int tempValue = mArrayToSort[lowIndex];
        mArrayToSort[lowIndex] = mArrayToSort[highIndex];
        mArrayToSort[highIndex] = tempValue;
    }
}
