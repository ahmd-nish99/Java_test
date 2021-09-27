public class Swap {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        System.out.println("Initial value of X :"+ x +"  Initial value of Y : "+y);

        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("Final value of X :"+ x +"   Final value of Y : "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Final value of X :"+ x +"   Final value of Y : "+y);




    }


}
