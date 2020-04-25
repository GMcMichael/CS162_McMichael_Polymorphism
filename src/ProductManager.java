public class ProductManager extends Employee {
    private  final static int SALARY_MULTIPLIER = 2;
    private final static int SHARES_PER_YEAR = 100;
    private final static int VACATION_MAX  = 4;
    private final static int VACATION_MIN  = 3;


    public ProductManager(){
        super();
    }
    public ProductManager(String name, int yearsOfExperience, int yearsAtCompany){
        super(name, yearsOfExperience, yearsAtCompany);
        super.setBaseSalary((getBaseSalary()*SALARY_MULTIPLIER));
    }

    public int vacationTime(){
        return super.vacationTime(VACATION_MAX, VACATION_MIN);
    }

    public int stockOptions(){
        return getYearsAtCompany() * SHARES_PER_YEAR;
    }

    @Override
    public String motto() {
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nVacation time: " + vacationTime() + " weeks" + ". Stock Options: " + stockOptions() + " shares";
    }
}