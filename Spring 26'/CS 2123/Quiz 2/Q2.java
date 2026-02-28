import java.util.ArrayList;
public class Q2 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zenitsu");
        arrayList.add("Sung Jinwoo");
        String item = "Sung Jinwoo";
        int index = arrayList.indexOf(item);
        if (index != 1) {
            System.out.println("Index of " +item + ": " + index);
        }
        else {
            System.out.println(item + " not found in the ArrayList.");
        }
    }
    
}
