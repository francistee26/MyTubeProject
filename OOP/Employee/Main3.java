import java.text.NumberFormat;

public class Main { 
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        System.out.println(Employee.numberOfEmployees);
        int wage = employee.calculateWage();
        System.out.println(NumberFormat.getCurrencyInstance().format(wage));
       


}

}