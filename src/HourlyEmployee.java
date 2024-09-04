import java.security.PrivilegedAction;

public class HourlyEmployee extends Employee {

    private double wage;
    private double horus;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public double earnings() {
        if (getHorus() <= 40){
            return getWage() * getHorus();
        }

        return 40 * getWage() + (getHorus() - 40) * getWage() * 1.5;

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHorus() {
        return horus;
    }

    public void setHorus(double horus) {
        this.horus = horus;
    }

    @Override
    public String toString() {
        return "Employee Information: " + super.toString() + "\nWage: " + wage + "\nHorus: " + horus + "\n";
    }

}
