public class Demo {


    public static void main (String[] args)
    {
        Calculator c =new Calculator();
        c.A = 12;
        c.B = 5;
        

        System.out.println("addition of the numbers is : "+ c.add(c.A,c.B) );
        System.out.println("subtraction of the numbers is : "+ c.sub() );
        System.out.println("Product of the numbers is : "+ c.multi(c.A,c.B) );
        System.out.println("Division of the numbers is : "+ c.div(c.A,c.B) );
        System.out.println("Modulus of the numbers is : "+ c.mod(c.A,c.B) );




    }


}