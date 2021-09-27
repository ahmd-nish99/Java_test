public class Triangle {

    double height;
    double base;
    double hypotenuse;
    public static double FindArea(double X, double Y)
    {
        return ((X*Y)/2);
    }//end of the area function

    public static double FindPerimeter(double X, double Y, double Z)
    {
        return (X + Y + Z);
    }//end of the perimeter function

    public static double FindHypotenuse(double X, double Y)
    {
        return Math.sqrt((Y*Y)+(X+X));
    }//end of the hypo function


}//end of the class



