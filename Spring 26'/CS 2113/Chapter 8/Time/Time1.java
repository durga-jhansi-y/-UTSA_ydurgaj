public class Time1{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public void setTime(int hour, int minute , int second){
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60){
            throw new IllegalArgumentException("hour, minute and/or second was out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString(){ // void if system out used 
        //System.out.printf("%02d:%02d:%02d", hour, minute, second);
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
 
    public String toString(){
        String period = "";
        if (hour <12){
            period = "AM";
        }
        else{
            period = "PM";
        }
        int displayHour = hour;
        if (hour ==0 || hour == 12){
            displayHour = 12;
        }
        else {
            displayHour = hour %12;
        }

        return String.format("%d:%02d:%02d %s", displayHour, minute, second, period);
    }

}