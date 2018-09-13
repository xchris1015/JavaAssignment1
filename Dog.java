public class Dog {
    String breed;
    int age;
    String color;
    int dogAge;

    public void setAge(int age){
        dogAge=age;
    }

    public int getAge(){
        System.out.println("Dog's age is : "+dogAge);
        return dogAge;//why should we return the dogAge in here?
    }

    void barking(){

    }

    void hungry(){

    }

    void sleeping(){

    }

    public Dog(String name){
        //this is a constructor has one parameter, name
        // the name of the constructor would be same as the public class
        System.out.println("The Dog Name is:" + name);
    }

    public static void main(String args[]){
        Dog myDog= new Dog("cube");
        myDog.setAge(1);
        myDog.getAge();
        System.out.println("Variable Value:"+ myDog.dogAge);
    }
}
