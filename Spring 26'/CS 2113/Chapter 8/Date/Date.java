public class Date {
    private int day;
    private int month;
    private int year;

    public static final int[] DAYS_PER_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year){

        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Month " + month + " is not valid");
        }
        
        if(day > DAYS_PER_MONTH[month] || day <=0 && !(month == 2 && day == 29)){
            throw new IllegalArgumentException("Day " + day + " is not valid for month " + month);
        }

        if(month == 2 && day == 29){
            if(!((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))){
                throw new IllegalArgumentException("Day " + day + " is not valid for month " + month + " in year " + year);
            }
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    }
    
}
