class bike {
    public void wheelShape(){
        System.out.println("The wheel shape for a bike is squre!");
    }

    public void wheelNum(){
        System.out.println("The wheel number for bike is 2!");

    }

    public void seatShape(){
        System.out.println("The wheel shape for a bike is cube!");

    }

}

class motorcycle{

    public void pedalNum(){
        System.out.println("The pedal number for motorcycle is 0!");
    }

    public void gasTank(){
        System.out.println("The gas Tank for motorcycle is full!");

    }

    public void motor(){
        System.out.println("This is a motor!");
    }

}

public class bicycle extends bike{

    public void pedalNum(){
        System.out.println("The pedal number for a bicycle is 2!");
    }


    public static void main(String args[]){
        bicycle obj = new bicycle();
        obj.pedalNum();
        motorcycle obj2= new motorcycle();
        obj2.pedalNum();
        obj.wheelNum();

    }
}

