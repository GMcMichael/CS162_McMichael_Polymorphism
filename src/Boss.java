import java.util.ArrayList;

public class Boss {

    public void giveRaise(Employee employee, double percentage){
        double baseSalary = employee.getBaseSalary();
        baseSalary += (baseSalary*percentage);
        employee.setBaseSalary(baseSalary);
    }

    public void giveRaise(ArrayList<Employee> employees, double percentage, String type){
        for (Employee e : employees) {
            if(e.getClass().getName().toLowerCase().startsWith(type.toLowerCase())){
                giveRaise(e, percentage);
            }
        }
    }

    public void giveAllRaise(ArrayList<Employee> employees, double percentage){
        for (Employee e: employees) {
            giveRaise(e, percentage);
        }
    }

}
