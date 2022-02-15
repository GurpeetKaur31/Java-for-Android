package mooc.vandy.java4android.calculator.logic;

public class Add
{
    private int a = 0;
    private int b = 0;

    public Add(int argumentOne, int argumentTwo)
    {
        a = argumentOne;
        b = argumentTwo;
    }

    public String toString()
    {
        return String.valueOf(a + b);
    }
}
