public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Jorge", "de Deus", "111", 100);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jahlim", "Rahbei", "222", 20, 40);
        ComissionEmployee comissionEmployee = new ComissionEmployee("Paulo", "Minozzo", "333", 10000, .06);
        BasePlusComissionEmployee basePlusComissionEmployee = new BasePlusComissionEmployee("My name", "is Jeff", "444", 5000, .04, 3000);


        System.out.println(salariedEmployee.toString());
        System.out.println(hourlyEmployee.toString());
        System.out.println(comissionEmployee.toString());
        System.out.println(basePlusComissionEmployee.toString());
    }
}