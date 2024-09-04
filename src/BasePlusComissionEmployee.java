public class BasePlusComissionEmployee extends ComissionEmployee {

    private double baseSalary;

    public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSalary, double comissionSalary, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSalary, comissionSalary);
        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "BasePlusComissionEmployee [baseSalary=" + baseSalary + "]";
    }

}
