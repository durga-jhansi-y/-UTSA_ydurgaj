package HospitalSystem;

public class Patient {
    private int id; 
    private String name;
    private String email;

    // constructor
    public Patient(){
        id = 0;
        name = null;
        email = null;
    }

    public Patient(int id , String name, String email ){
        // setId(newId);
        // setName(newName);
        // setEmail(newEmail);
        this.id = id;
        this.name = name;
        this.email = email;

        System.out.println("Patient created with info : ID: " + id + ", Name: " + name + ", Email: " + email);
    }

    //getters and setters = gets info and sets info 

    public int getId(){
        System.out.println("Patient ID(" + id + ") accessed.");
        return id;
    }

    public String getName(){
        System.out.println("Patient Name(" + name + ") accessed.");
        return name;
    }

    public String getEmail(){
        System.out.println("Patient Email(" + email + ") accessed.");
        return email;
    }

    // private void setId(int newId){
    //     System.out.println("Patient ID changed from " + id + " to " + newId + ".");
    //     id = newId;
    // }

    public void setName(String newName){
        System.out.println("Patient Name changed from " + name + " to " + newName + ".");
        name = newName;
    }

    public void setEmail(String newEmail){
        System.out.println("Patient Email changed from " + email + " to " + newEmail + ".");
        email = newEmail;
    }



}
