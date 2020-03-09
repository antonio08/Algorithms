package utils;

public class Stack
{
    final char [] mStack = new char [100];
    int mPositionStack = 0;
    boolean mIsStackEmpty = false;

    public void push(final char value)
    {
        if (mPositionStack >= 99)
        {
            System.out.println("The stack is full");
            return;
        }

        mStack[mPositionStack] = value;
        mPositionStack++;
    }

    public char pop()
    {
        mPositionStack--;

        if (mPositionStack < 0)
        {
            System.out.println("The stack is empty");
            mIsStackEmpty = true;
            return '\0';
        }
        return mStack[mPositionStack];
    }

    public boolean isStackEmpty()
    {
        return mIsStackEmpty || mPositionStack == 0;
    }
}
