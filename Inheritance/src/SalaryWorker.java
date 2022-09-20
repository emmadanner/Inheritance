public class SalaryWorker extends Worker
{
    private double annualSalary;

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int yearOfBirth)
    {
        super(IDNum, firstName, lastName, title, yearOfBirth);
        this.annualSalary = 45000;
    }

    @Override
    double calculateWeeklyPay(double hoursWorked)
    {
        return super.calculateWeeklyPay(annualSalary / 52);
    }

    String displayWeeklyPay(double hoursWorked)
    {
        return super.displayWeeklyPay(annualSalary / 52);
    }
}
