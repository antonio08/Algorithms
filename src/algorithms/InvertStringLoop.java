package algorithms;

public class InvertStringLoop
{
    public String reverse(final String originalString)
    {
        StringBuilder reverseString = new StringBuilder();

        int startingPosition = originalString.length() - 1;

        for (int i = startingPosition; i >= 0; i--)
        {
            reverseString.append(originalString.charAt(i));
        }

        return reverseString.toString();
    }
}
