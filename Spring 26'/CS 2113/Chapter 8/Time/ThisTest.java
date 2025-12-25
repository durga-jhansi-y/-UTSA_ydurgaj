public class ThisTest {
    public static void main(String[] args){
        SimpleTest time = new SimpleTest(15 , 30 , 19);
        System.out.println(time.buildString());
    }
}

class SimpleTest {
    private int hour;
    private int minute;
    private int second;

    public SimpleTest(int hour, int minute , int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString(){
        return String.format("this.toUniversalString(): %s%ntoUniversalString(): %s",this.toUniversalString(), toUniversalString());
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",this.hour, this.minute, this.second);
    }

}
