public class EmployeeTest {
    public static void main(String[] args){
        Date birDate = new Date(10,16,2005);
        Date hireDate = new Date(1,5,2028);
        Employee employee = new Employee("Durga", "Yerukala", birDate, hireDate);

        System.out.println(employee.toString());
    }
}
