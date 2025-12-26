public class EmployeeTest{
    public static void main(String[] args){
        System.out.printf("Employees before instantiation: %d%n",Employee.getCount());

        Employee e1 = new Employee("Durga","Yerukala");
        Employee e2 = new Employee("Jhansi","Yerukala");

        System.out.printf("The count after using e1.getCount() is %d%n",e1.getCount());
        System.out.printf("The count after using e2.getCount() is %d%n",e2.getCount());
        System.out.printf("Employees after instantiation: %d%n",Employee.getCount());

        System.out.printf("Employee1 : %s %s%n",e1.getFirstName(),e1.getlastName());
        System.out.printf("Employee2 : %s %s%n",e2.getFirstName(),e2.getlastName());
        
    }
}