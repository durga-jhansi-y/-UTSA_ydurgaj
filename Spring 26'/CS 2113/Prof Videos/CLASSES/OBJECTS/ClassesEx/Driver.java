package ClassesEx;

public class Driver {

    public static void main(String[] args){
        Dog d1 = new Dog(); // object
        d1.name = "Snowy";
        d1.id = 1;
        d1.age = 4;
        d1.breed = "Husky";
        d1.size = "medium";
        d1.weight = 60;
        d1.color = "Brown/White";

        Dog d2 = new Dog();
        d2.name = "Max";
        d2.id = 2;
        d2.age = 7;
        d2.breed = "German Shepherd";
        d2.size = "large";
        d2.weight = 160;
        d2.color = "Black/Tan";

        System.out.println(d1.name+", " + d1.weight +": ");
        if (d1.overWeight()){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Not Overweight");
        }
        System.out.println(d2.name+", " + d2.weight +": ");
        if (d2.overWeight()){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Not Overweight");
        }

    }
    
}
