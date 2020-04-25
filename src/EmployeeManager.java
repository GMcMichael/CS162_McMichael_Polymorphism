import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public ArrayList<Employee> getEmployees(){
        return  employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public void displayEmployees(){
        for (Employee e: employees) {
            System.out.println(e.toString());
            System.out.println();
        }
    }

    public void displaySpecificInfo(){
        for (Employee e: employees) {
            String str = e.getClass().getName();
            String output = "Name: " + e.getName() + ", Job: " + str + "\nVacation days: ";
            switch (str){
                case "TechnicalWriters":
                    TechnicalWriter technicalWriter = ((TechnicalWriter)e);
                    output += technicalWriter.vacationTime();
                    break;
                case "Engineers":
                    Engineer engineer = ((Engineer)e);
                    output += engineer.vacationTime() + ", Sign-on bonus: $" + engineer.signOnBonus() + "k";
                    break;
                case "ProductManagers":
                    ProductManager productManager = ((ProductManager)e);
                    output += productManager.vacationTime() + ", Stock options: " + productManager.stockOptions();
                    break;
            }
            System.out.println(output);
        }
    }

}
