package mooc.vandy.java4android.calculator.logic;

public class Multiply
{
    private int a = 0;
    private int b = 0;

    public Multiply(int argumentOne, int argumentTwo)
    {
        a = argumentOne;
        b = argumentTwo;
    }

    public String toString() {
        return String.valueOf(a * b);
    }
}
