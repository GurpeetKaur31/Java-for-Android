package mooc.vandy.java4android.birthday.logic;

import java.util.Random;

import mooc.vandy.java4android.birthday.ui.OutputInterface;

public class Logic implements LogicInterface {

    public static final String TAG = Logic.class.getName();

    OutputInterface mOut;

    public Logic(OutputInterface out) {
        mOut = out;
    }

    public void process()
    {
        int groupSize = mOut.getSize();
        int simulationCount = mOut.getCount();

        if (groupSize < 2 || groupSize > 365)
        {
            mOut.println("Error: Group Size must be in the range 2-365.");
            return;
        }
        if (!(simulationCount >= 1 && simulationCount <= 100000))
        {
            mOut.println("Error: Simulation Count must be in the range 1-100000.");
            return;
        }

        double percent = calculate(groupSize, simulationCount);

        // report results
        mOut.println("For a group of " + groupSize + " people, the percentage " + " of times that two people share the same birthday is " + String.format("%.2f%% of the time.", percent));
    }

    public double calculate(int size, int count)
    {
        int a = 0;
        Random r = new Random();
        for (int i = 0; i < count; i++)
        {
            int arr[] = new int[365];
            r.setSeed(i + 1);
            for (int j = 0; j < size; j++)
            {
                int n = r.nextInt(365);
                arr[n]++;
                if (arr[n] >= 2)
                {
                    a++;
                    break;
                }
            }
        }
        return a*100.0/count;
    }
}
