package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract
{
    private int a = 0;
    private int b = 0;

    public Subtract(int argumentOne, int argumentTwo)
    {
        a = argumentOne;
        b = argumentTwo;
    }

    public String toString()
    {
        if(a>=b)
            return String.valueOf(a - b);
        else
            return String.valueOf(b - a);
    }
}
