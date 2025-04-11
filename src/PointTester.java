//In this program we are going to have you practice using the Point class.
//
//We’ve already created a Point object at (10, 5), printed it out, and moved it.
//
//First, try to run this program. Then, create your own Point at the position (2, 4) and print it out.
//
//Then move your new point 5 units in the x direction and 2 units in the y direction. Finally, print out the point again to see that it moved.

public class PointTester
{
    public static void main(String[] args)
    {
        Point point = new Point(2, 4);
        System.out.println(point);

        point.move(5, 2);
        System.out.println(point);
    }
}