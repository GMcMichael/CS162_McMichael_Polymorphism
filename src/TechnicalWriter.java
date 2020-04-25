public class TechnicalWriter extends Employee{
    private final static int VACATION_MAX  = 2;
    private final static int VACATION_MIN  = 1;

    public TechnicalWriter(){
        super();
    }
    public TechnicalWriter(String name, int yearsOfExperience, int yearsAtCompany){
        super(name, yearsOfExperience, yearsAtCompany);
    }

    public int vacationTime(){
        return super.vacationTime(VACATION_MAX, VACATION_MIN);
    }

    @Override
    public String motto() {
        return "You can always edit a bad page. You can’t edit a blank page";
    }

    @Override
    public String toString() {
        return super.toString()+ "\nVacation time: " + vacationTime() + " weeks" ;
    }
}