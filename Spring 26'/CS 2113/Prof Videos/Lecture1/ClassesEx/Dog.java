package ClassesEx;

public class Dog{

    public int id;
    public String name;
    public double weight;
    public int age;
    public String breed;
    public String size;
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