//Shapes Logic
package mooc.vandy.java4android.shapes.logic;

import java.util.Locale;

import mooc.vandy.java4android.shapes.ui.OutputInterface;

import static java.lang.String.format;

public class Logic
        implements LogicInterface {

    public static final String TAG = Logic.class.getName();

    private final OutputInterface mOut;

    public Logic(OutputInterface out) {
        mOut = out;
    }

    @Override
    public void process() {
        // Get which calculation should be computed.  Do not worry
        // about the specifics of this right now.
        Shapes shapeForCalculations = mOut.getShape();

        // Store the values returned by the User Interface.
        double mLength = mOut.getLength();
        double mWidth = mOut.getWidth();
        double mHeight = mOut.getHeight();
        double mRadius = mOut.getRadius();

             switch (shapeForCalculations) {
            case Box:
                mOut.print("A " + mLength + " by " + mWidth + " by " + mHeight + " box has a volume of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", boxVolume(mLength, mWidth, mHeight)));
                mOut.println();

                mOut.print("A " + mLength + " by " + mWidth + " by " + mHeight + " box has a surface area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", boxSurfaceArea(mLength, mWidth, mHeight)));
                mOut.println();

            case Rectangle:
                mOut.print("A " + mLength + " by " + mWidth + " rectangle has a perimeter of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rectanglePerimeter(mLength, mWidth)));
                mOut.println();

                mOut.print("A " + mLength + " by " + mWidth + " rectangle has area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rectangleArea(mLength, mWidth)));
                mOut.println();
                break;
            case Sphere:
                mOut.print("A sphere with radius " + mRadius + " has a volume of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", sphereVolume(mRadius)));
                mOut.println();

                mOut.print("A sphere with radius " + mRadius + " has surface area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", sphereSurfaceArea(mRadius)));
                mOut.println();

            case Circle:
                mOut.print("A circle with radius " + mRadius + " has a perimeter of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", circleCircumference(mRadius)));
                mOut.println();

                mOut.print("A circle with radius " + mRadius + " has area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", circleArea(mRadius)));
                mOut.println();
                break;
            case Triangle:
                mOut.print("A right triangle with base " + mLength + " and height " + mWidth + " has a perimeter of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rightTrianglePerimeter(mLength, mWidth)));
                mOut.println();

                mOut.print("A right triangle with base " + mLength + " and height " + mWidth + " has area of: ");
                mOut.println(format(Locale.getDefault(), "%.2f", rightTriangleArea(mLength, mWidth)));
                mOut.println();
                break;
            default:
                break;
        }
    }

        //rectangleArea() method to find the area of a rectangle with two parameters length and width
        public static double rectangleArea(double length, double width)
        {
            double a_rect= length * width;
            return(a_rect);   //returning the value of area of rectangle
        }

        //rectanglePerimeter() method to find the perimeter of a rectangle with two parameters length and width
        public static double rectanglePerimeter(double length, double width)
        {
            double p_rect= 2 * (length + width);
            return(p_rect);   //returning the value of perimeter of rectangle
        }

        //circleArea() method to find the area of a circle with one parameter radius
        public static double circleArea(double radius)
        {
            double a_cir=Math.PI * radius * radius ;
            return(a_cir);   //returning the value of area of circle
        }

        //circleCircumference() method to find the circumference of a circle with one  parameter radius
        public static double circleCircumference(double radius)
        {
            double c_cir= 2 * Math.PI * radius;
            return(c_cir);     //returning the value of area of circle
        }

        //rightTriangleArea() method to find the area of a right angle triangle with two parameters base and height
        public static double rightTriangleArea(double base, double height)
        {
            double a_tri= (base * height)/2;
            return(a_tri);    //returning the value of area of right angle triangle
        }

        //rightTriangleArea() method to find the area of a right angle triangle with two parameters base and height
        public static double rightTrianglePerimeter(double base, double height)
        {
            double p_tri= base + height + Math.sqrt(base * base + height * height);
            return(p_tri);    //returning the value of perimeter of right angle triangle
        }

        //boxVolume() method to find the volume of Box with three parameters length, width and depth
        public static double boxVolume(double length, double width, double depth)
        {
            double v_box= length * width * depth;
            return (v_box);      //returning the value of volume of box
        }

        //boxSurfaceArea() method to find the Surface Area of Box with three parameters length, width and depth
        public static double boxSurfaceArea(double length, double width,double depth)
        {
            double sa_box= 2 * (length*width + width*depth + depth*length);
            return(sa_box);      //returning the value of Surface Area of box
        }

        //sphereVolume() method to find the Volume of sphere with one parameter radius
        public static double sphereVolume(double radius)
        {
            double v_sphere= (4 * (Math.PI * radius * radius * radius))/3;
            return(v_sphere);      //returning the value of volume of sphere
        }

        //sphereSurfaceArea() method to find the Surface Area of sphere with one parameter radius
        public static double sphereSurfaceArea(double radius)
        {
            double sa_sphere= 4 * Math.PI * radius * radius;
            return(sa_sphere);       //returning the value of Surface Area of sphere
        }
    }




