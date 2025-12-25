public class Time1Test{
    public static void main(String[] args){
        Time1 time = new Time1();

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(23,25,32);
        displayTime("After calling setTime", time);
        System.out.println();

        try{
            time.setTime(99,99,99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        displayTime("After calling setTime with invalid values", time);

    }

    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversalTime: %s%nStandardTime: %s%n%n",header,t.toUniversalString(), t.toString());
        
    }
}