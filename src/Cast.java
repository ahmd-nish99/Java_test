public class Cast {


    public static void main(String Args[]){
        int x = 10;
        double y = 10.5;

        double xDbl = (double) x;
        long xLong = (long) x;
        float xFloat = (float)x;
        float xLongtofloat = (float) xLong;
        int yInt = (int) y;
        long yLong = (long) y;

        System.out.println("X : "+ x);
        System.out.println("X coverted to long : "+ xLong);
        System.out.println("X converted to Float : "+ xFloat);
        System.out.println("X long concerted to Float : "+ xLongtofloat);
        System.out.println("Y : "+ y);
        System.out.println("Y as integer : "+ yInt);
        System.out.println("Y as long : "+ yLong);
    }


}// end of the class

