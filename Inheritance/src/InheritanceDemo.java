import java.util.ArrayList;
import java.util.Arrays;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
        Worker w1 = new Worker("0001", "Emma", "Danner", "N/A", 2004);
        Worker w2 = new Worker("0002", "William", "Howard", "Mr.", 2002);
        Worker w3 = new Worker("0003", "Rue", "Mongus", "Ms.", 2006);

        SalaryWorker sW1 = new SalaryWorker("0004", "Reghan", "Smith", "Ms.", 2004);
        SalaryWorker sW2 = new SalaryWorker("0005", "Cindy", "Wilson", "Mrs.", 1970);
        SalaryWorker sW3 = new SalaryWorker("0006", "Rosie", "Danner", "Dog", 2016);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(w1);
        workers.add(w2);
        workers.add(w3);

        workers.add(sW1);
        workers.add(sW2);
        workers.add(sW3);

        for(int week = 1; week < 4; week++)
        {
            if(week == 1)
            {
                System.out.println("Week 1");
                System.out.println();

                w1.displayWeeklyPay(40);
                w2.displayWeeklyPay(40);
                w3.displayWeeklyPay(40);

                sW1.displayWeeklyPay(40);
                sW2.displayWeeklyPay(40);
                sW3.displayWeeklyPay(40);
            }
            else if(week == 2)
            {
                Worker.hoursWorked = 50;

                System.out.println("Week 2");
                System.out.println();

            }
            else if(week == 3)
            {
                Worker.hoursWorked = 40;

                System.out.println("Week 3");
                System.out.println();

            }
        }
    }
}