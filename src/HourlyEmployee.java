public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (getHours() <= 40){
            return getWage() * getHours();
        }

        return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee Information: %s%nWage: %.2f%nHours: %.2f%n",
                super.toString(), wage, hours
        );
    }


}
