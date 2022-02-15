package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

public class Logic implements LogicInterface
{
    private static final int ADD = 1;
    private static final int SUB = 2;
    private static final int MUL = 3;
    private static final int DIV = 4;

    protected ActivityInterface mOut;

    public Logic(ActivityInterface out)
    {
        mOut = out;
    }

    public void process(int argumentOne, int argumentTwo, int operation)
    {
        if(operation == ADD)
        {
            Add a1 = new Add(argumentOne, argumentTwo);
            mOut.print(a1.toString());
        }
        else if(operation == SUB)
        {
            Subtract s1 = new Subtract(argumentOne, argumentTwo);
            mOut.print(s1.toString());
        }
        else if (operation == MUL)
        {
            Multiply m1 = new Multiply(argumentOne, argumentTwo);
            mOut.print(m1.toString());
        }
        else
            {
            Divide d1 = new Divide(argumentOne, argumentTwo);
            mOut.print(d1.toString());
        }

    }
        
    }

