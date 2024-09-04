public class ComissionEmployee extends Employee {

    private double grossSalary;
    private double comissionSalary;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public double earnings() {
        return 0;
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



}
