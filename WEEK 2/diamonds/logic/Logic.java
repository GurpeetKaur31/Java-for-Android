package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

public class Logic implements LogicInterface {

    public static final String TAG = Logic.class.getName();

    private OutputInterface mOut;

    public Logic(OutputInterface out)
    {
        mOut = out;
    }

    public void process(int size)
    {
            int height = size * 2 + 1;
            int width = size * 2 + 2;
            int flag = -(size+1);

            for(int i=1;i<=height;i++)
            {
                flag++;
                for (int j=1;j<=width;j++)
                {
                    if((i == 1 || i == height) && (j == 1 || j == width))
                        mOut.print("+");
                    else if((i == 1 || i == height) && !(j == 1 || j == width))
                        mOut.print("-");
                    else if(!(i == 1 || i == height) && (j == 1 || j == width))
                        mOut.print("|");
                    else {
                        drawDiamond(size, i, j, flag);
                    }
                }
                mOut.print("\n");
            }
        }

        public void drawDiamond(int size, int i, int j, int flag)
        {
            int d_RowThickness;
            if (flag <= 0)
            {
                d_RowThickness = i*2-2;
            }
            else {
                d_RowThickness = (i-flag*2)*2-2;
            }
            int d_Midpoint = size + 1;
            int d_Left = d_Midpoint - (d_RowThickness/2-1);
            int d_Right = d_Midpoint + (d_RowThickness/2);
            int frameTop = 1;
            int frameBottom = size * 2 + 1;

            if (j >= d_Left && j <=d_Right)
            {
                if (j == d_Left || j == d_Right)
                {
                    if (i < d_Midpoint && i > frameTop)
                    {
                        if (j == d_Left)
                        {
                            mOut.print("/");
                        }
                        else
                            {
                            mOut.print("\\");
                        }
                    }
                    else if (i == d_Midpoint)
                    {
                        if (j == d_Left)
                        {
                            mOut.print("<");
                        } else
                            {
                            mOut.print(">");
                        }
                    }
                    else if (i > d_Midpoint && i < frameBottom)
                    {
                        if (j == d_Left)
                        {
                            mOut.print("\\");
                        }
                        else
                            {
                            mOut.print("/");
                        }
                    }
                }
                else
                    {
                    if (i % 2 == 0)
                    {
                        mOut.print("=");
                    }
                    else
                        {
                        mOut.print("-");
                    }
                }
            }
            else
                {
                mOut.print(" ");
            }
        }
    }




