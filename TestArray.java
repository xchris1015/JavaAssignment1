public class TestArray {
    public static void main(String args[]){
        double[] myList={1,2,3,4,5};

        for (int i=0;i<myList.length;i++){
            System.out.println(myList[i]+"");
        }

        double total=0;
        for(int i=0;i<myList.length;i++){
            total+=myList[i];
        }
        System.out.println("The total of list is:"+total);

        double largestnum=myList[0];
        for(int i=1;i<myList.length;i++) {
            if (largestnum<myList[i]) largestnum= myList[i];
        }

        for(double elements:myList){
            System.out.println(elements);
        }
        }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        printArray(new int[]{3, 1, 2, 6, 4, 2});

    }



}


