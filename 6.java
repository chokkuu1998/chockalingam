import java.lang.Math;
import java.util.Scanner;

class Point
{
    double x;
    double y;
}
class Compare
{
    Double maxx;
    Double maxy;
    Double minx;
    Double miny;

    public void maxx(double num)
    {
        if (maxx == null)
            maxx = num;
        else if(num > maxx)
            maxx = num;
    }
    public void maxy(double num)
    {
        if (maxy == null)
            maxy = num;
        else if(num > maxy)
            maxy = num;
    }
    public void minx(double num)
    {
        if (minx == null)
            minx = num;
        else if(num < minx)
            minx = num;
    }
    public void miny(double num)
    {
        if (miny == null)
            miny = num;
        else if(num < miny)
            miny = num;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Compare compare = new Compare();

        int n = input.nextInt();

        if(n>=2 && n<=30)
        {
            for (int i = 0; i < n; i++) 
            {
                Point points = new Point();

                points.x = input.nextDouble();
                points.y = input.nextDouble();

                compare.minx(points.x);
                compare.miny(points.y);
                compare.maxx(points.x);
                compare.maxy(points.y);
            }
        }
        double dis;
        dis=Math.sqrt((compare.maxx-compare.minx)*(compare.maxx-compare.minx) + (compare.maxy-compare.miny)*(compare.maxy-compare.miny));
        System.out.printf("%.4f\n",dis);
    }
}
