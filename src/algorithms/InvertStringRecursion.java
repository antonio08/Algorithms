package algorithms;

public class InvertStringRecursion
{
    public String revert (final String originalString)
    {
        if(originalString.length() == 1)
        {
            return originalString;
        }
        else
        {
            return revert(originalString.substring(1)) + originalString.charAt(0);
        }
    }
}
