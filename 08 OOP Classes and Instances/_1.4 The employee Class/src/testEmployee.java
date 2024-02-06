import org.w3c.dom.ls.LSOutput;

public class testEmployee {

    public static void main(String[] args) {
    Employee e1 = new Employee(1,"Tom", "Smith", 2000);
        e1.raiseSalary(5);
        System.out.println("employee id "+ e1.getId() + " name "+ e1.getName() +" monthly salary " + e1.getSalary() + " salary in a year: " + e1.getAnnualSalary());
        System.out.println("old salary: " + e1.getSalary() + " salary raise: " + e1.raiseSalary(5));
        System.out.println(e1.toString());
    }
}
