public class Worker extends Person
{
    public double hourlyPayRate;
    public Worker(String IDNum, String firstName, String lastName, String title, int yearOfBirth)
    {
        super(IDNum, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = 9.15;
    }

    double calculateWeeklyPay(double hoursWorked)
    {
        double overtime = 0;
        double overtimePay = this.hourlyPayRate * 1.5;
        double weeklyPay;
        if(hoursWorked > 40)
        {
            overtime = hoursWorked - 40;
            weeklyPay = (40 * hoursWorked) + (overtime * overtimePay);
        }
        else {
            weeklyPay = hoursWorked * this.hourlyPayRate;
        }
        return weeklyPay;
    }

    String displayWeeklyPay(double hoursWorked)
    {
        double overtime;
        double normalPay = this.hourlyPayRate;
        double overtimePay = normalPay * 1.5;
        String printReturn = "";

        if(hoursWorked > 40)
        {
            overtime = hoursWorked - 40;
            normalPay = this.hourlyPayRate * 40;
            overtimePay = overtime * overtimePay;
            System.out.println("Overtime Hrs  Overtime pay Hours worked  Weekly pay  Normal pay");
            System.out.printf("%13.2f %13.2f %13.2f %13.2f %13.2f %13.2f", overtime, overtimePay, hoursWorked, normalPay);
            System.out.printf("%13.2f %13.2f %13.2f %13.2f ", overtime, overtimePay, hoursWorked, normalPay);
            System.out.println(printReturn);
        }
        normalPay = this.hourlyPayRate * hoursWorked;
        printReturn = "Hours Worked: " + hoursWorked + "\n" +
                "Weekly Pay: " + normalPay;
        System.out.println(printReturn);

        return printReturn;
    }
}
