package algorithms;

public class Factorial
{
    public int calculate(final int value)
    {
        if (value == 1)
        {
            return value;
        }
        else
        {
            return calculate(value - 1) * value;
        }
    }
}
