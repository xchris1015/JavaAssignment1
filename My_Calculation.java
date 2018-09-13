class calculation{
    int z;

    public void addition(int x, int y){
        z=x+y;
        System.out.println("The sum of"+x+"and"+y+"is:"+z);
    }

    public void subtraction(int x, int y){
        z=x-y;
        System.out.println("The different of"+x+"and"+y+"is:"+z);
    }
}


public class My_Calculation extends calculation {
    public void multiplication(int x, int y){
        z=x*y;
        System.out.println("The product of"+x+"and"+y+"is:"+z);

    }

    public void division(int x, int y){
        z=x/y;
        System.out.println("The division of"+x+"and"+y+"is:"+z);

    }

    public static void main(String args[]){
        int a =20, b=10;
        My_Calculation demo= new My_Calculation();
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multiplication(a,b);
        demo.division(a,b);

    }
}
