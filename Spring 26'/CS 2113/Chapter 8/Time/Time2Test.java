public class Time2Test {
    public static void main(String[] args){
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21,34); // 21:34:00
        Time2 t4 = new Time2(12,25,42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        System.out.printf("t1: %s%n", t1.toUniversalString());
        System.out.printf("t2: %s%n", t2.toUniversalString());
        System.out.printf("t3: %s%n", t3.toUniversalString());
        System.out.printf("t4: %s%n", t4.toUniversalString());
        System.out.printf("t5: %s%n%n", t5.toUniversalString());

        // attempt to initialize t6 with invalid values
        try{
            Time2 t6 = new Time2(27,74,99); // invalid values
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception while initializing t6: %s%n", e.getMessage());
        }
    }
}
