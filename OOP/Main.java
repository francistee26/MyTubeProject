import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
         var employee = new Employee();
        employee.setBaseSalary(1);
        employee.getBaseSalary();
    
        employee.setHourlyRate(0);
        employee.getHourlyRate();

        int wage = employee.calculateWage(10);

        System.out.println(NumberFormat.getCurrencyInstance().format(wage));
    }

}