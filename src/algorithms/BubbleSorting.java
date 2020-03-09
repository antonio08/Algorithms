package algorithms;

public class BubbleSorting
{
    public int [] sort(int [] arrayToSort)
    {
        final int arraySize = arrayToSort.length;
        for (int i = 0; i < arraySize - 1; i++)
        {
            for (int j = 0; j < arraySize - i - 1; j++)
            {
                if (arrayToSort[j] > arrayToSort[j+1])
                {
                    final int tempValue = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = tempValue;
                }
            }
        }

        return arrayToSort;
    }
}
