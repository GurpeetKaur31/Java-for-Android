package mooc.vandy.java4android.calculator.logic;

public class Divide
{
    private int a = 0;
    private int b = 0;

    public Divide(int argumentOne, int argumentTwo)
    {
        a = argumentOne;
        b = argumentTwo;
    }

    public String toString()
    {
        return String.valueOf(a / b) + " R:" + String.valueOf(a % b);
    }
}
