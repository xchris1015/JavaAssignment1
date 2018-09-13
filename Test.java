public class Test {

    public static void main (String args[]){
        int a,b;
        a=10;
        b=(a==1)?20:30; // if else statement ariable x = (expression) ? value if true : value if false
        System.out.println("Value of b is"+b);

        b=(a==10)?20:30;
        System.out.println("Value of b is :"+b);

        String name = "James";

        boolean result = name instanceof String;
        System.out.println(result);

        int [] numbers ={10,20,30,40,50};
        for (int x : numbers){
            System.out.println(x);
            System.out.println(",");
        }

        System.out.println("\n");

        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( String nam : names ) {
            System.out.print( nam );
            System.out.print(",");
        }


    }

}

