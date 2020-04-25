public class Engineer extends Employee {
    private final static double SALARY_MULTIPLIER  = 1.5;
    private final static int BONUS_MIN  = 5000;
    private final static int BONUS_MAX  = 10000;
    private final static int VACATION_MAX  = 3;
    private final static int VACATION_MIN  = 2;


    public Engineer(){
        super();
    }

    public Engineer(String name, int yearsOfExperience, int yearsAtCompany){
        super(name, yearsOfExperience, yearsAtCompany);
        super.setBaseSalary((getBaseSalary()*SALARY_MULTIPLIER));
    }


    public int vacationTime(){
        return super.vacationTime(VACATION_MAX, VACATION_MIN);
    }

    public int signOnBonus(){
        if(getYearsOfExperience() < 5)return BONUS_MIN;
        else return BONUS_MAX;
    }

    @Override
    public String motto() {
        return "To the optimist, the glass is half full." +
                "To the pessimist, the glass is half empty." +
                "To the engineer, the glass is twice as big as it needs to be.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nVacation time: " + vacationTime() + " weeks" + ". Sign on bonus: $" + signOnBonus();
    }
}