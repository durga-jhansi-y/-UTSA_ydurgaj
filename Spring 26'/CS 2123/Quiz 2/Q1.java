import java.util.ArrayList;
public class Q1 {
    public static void main(String[] args){
        ArrayList<String>names = new ArrayList<>();
        names.add("Hidan");
        names.add("Shikamaru");
        names.remove(names);
        for(int i = 0; i<1; i++){
            names.remove(i);
        }
        System.out.println(names);
    }
}