public class Main {

    public static void main(String[] args) {
        TechnicalWriter technicalWriter = new TechnicalWriter("Mark", 4, 2);
        //System.out.println(technicalWriter.toString());
        //System.out.println();
        Engineer engineer = new Engineer("Natashia", 7, 2);
        //System.out.println(engineer.toString());
        //System.out.println();
        ProductManager productManager = new ProductManager("Carlos", 8, 5);
        //System.out.println(productManager.toString());
        //System.out.println();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(technicalWriter);
        employeeManager.addEmployee(engineer);
        employeeManager.addEmployee(productManager);

        employeeManager.displayEmployees();

        Boss boss = new Boss();
        //boss.giveAllRaise(employeeManager.getEmployees(), 0.25);
        boss.giveRaise(employeeManager.getEmployees(), 0.25, "e");

        employeeManager.displayEmployees();
    }
}