package algorithms;

import utils.Stack;

public class BalancedString
{
    public static final char OP_SB = '[';
    public static final char OP_CB = '(';
    public static final char OP_AB = '{';

    public static final char CP_SB = ']';
    public static final char CP_CB = ')';
    public static final char CP_AB = '}';

    public boolean isBalanced(final String input)
    {
        final Stack stack = new Stack();

        final char [] inputInCharArray = input.toCharArray();

        for (char value : inputInCharArray)
        {
            if (isOpeningParenthesis(value))
            {
                stack.push(value);
                continue;
            }

            if(isClosingParenthesis(value))
            {
                if (stack.isStackEmpty())
                {
                    return false;
                }

                char poppedValue = stack.pop();
                if (!isMatchingParenthesis(poppedValue, value))
                {
                    return false;
                }
            }
        }

        return stack.isStackEmpty();
    }

    private boolean isOpeningParenthesis(final char value)
    {
        return OP_SB == value || OP_CB == value ||  OP_AB == value;
    }

    private boolean isClosingParenthesis(final char value)
    {
        return CP_SB == value || CP_CB == value || CP_AB == value;
    }

    private boolean isMatchingParenthesis(final char openingParenthesis, final char closingParenthesis)
    {
        switch (openingParenthesis)
        {
            case OP_SB:
                return CP_SB == closingParenthesis;

            case OP_CB:
                return CP_CB == closingParenthesis;

            case OP_AB:
                return CP_AB == closingParenthesis;
        }

        return false;
    }
}
