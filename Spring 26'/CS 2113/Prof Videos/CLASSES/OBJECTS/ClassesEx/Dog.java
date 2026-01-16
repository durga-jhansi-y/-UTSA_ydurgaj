package ClassesEx;

public class Dog{

    int id;
    String name;
    double weight;
    int age;
    String breed;
    String size;
    String color;

    public boolean overWeight(){
        if(size.equals("small")&& weight >30){
            return true;
        }
        else if(size.equals("medium")&& weight> 65){
            return true;
        }
        else if (size.equals("large")&& weight>150){
            return true;
        }
        return false;
    }
    
}