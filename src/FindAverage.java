public class FindAverage {

    public static void main (String[] args)
    {
        double X = 10;
        double Y = 5;
        double Z = 15;

        System.out.println ("The average is " + avg(X, Y, Z)+"\n" );
    }

    public static double avg(double X, double Y, double Z)
    {
        return (X + Y + Z) / 3;
    }//end of the avg function


}//end of the class
