package HospitalSystem;

public class Driver {
    public static void main(String[] args) {
        Patient p = new Patient(1, "John Doe", "j.doe@gmail.com");

        // p.setId(1);
        // p.setName("John Doe");
        // p.setEmail("j.doe@gmail.com");

        System.out.println("Send message to " + p.getEmail());


    }
}
