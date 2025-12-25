
public class Account {
    private String name;// instance variable
    private double balance; // instance variable

    //constructor initializes name with parameter value
    public Account(String name , double balance) {
        this.name = name; // "this." refers to the instance variable 

        if (balance >0.0){
            this.balance = balance;
        }else {
            this.balance = 0.0;
        }
    }

    public void deposit (double amount){
        if (amount >0.0){
            balance +=amount;
        }
    }

    public double getBalance(){
        return balance; 
    }
    
    public void setName(String name) { // the parameter name overshadows the instance variable name
        this.name = name; // "this." refers to the instance variable 
    }
    
    public String getName() {
        return name;
    }
}
