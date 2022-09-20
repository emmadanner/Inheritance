import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WorkerTest
{
    Worker w1, w2, w3;
    SalaryWorker sW1, sW2, sW3;

    @BeforeEach
    void setUp()
    {
        w1 = new Worker("0001", "Emma", "Danner", "n/a", 2004);
        w2 = new Worker("0002", "William", "Howard", "Mr.", 2002);
        w3 = new Worker("0003", "Rue", "Mongus", "Ms.", 2006);

        sW1 = new SalaryWorker("0004", "Reghan", "Smith", "Ms.", 2004);
        sW2 = new SalaryWorker("0005", "Cindy", "Wilson", "Mrs.", 1970);
        sW3 = new SalaryWorker("0006", "Rosie", "Danner", "Dog", 2016);
    }


    @Test
    void calculateWeeklyPay() {
        w1.calculateWeeklyPay(47);
        assertEquals(1976.075, w1.calculateWeeklyPay(47));
    }

    @Test
    void displayWeeklyPay() {
    }
}