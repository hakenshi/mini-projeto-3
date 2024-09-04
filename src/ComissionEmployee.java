public class ComissionEmployee extends Employee {

    private double grossSalary;
    private double comissionSalary;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSalary, double comissionSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.comissionSalary = comissionSalary;
        this.grossSalary = grossSalary;
    }

    @Override
    public double earnings() {
        return getComissionSalary() * getGrossSalary();
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getComissionSalary() {
        return comissionSalary;
    }

    public void setComissionSalary(double comissionSalary) {
        this.comissionSalary = comissionSalary;
    }

    @Override
    public String toString() {
        return String.format(
                "BasePlusComissionEmployee Information: %s%nBase Salary: %.2f",
                super.toString(), getGrossSalary()
        );
    }



}
