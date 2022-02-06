package za.ac.cput.trevor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TrevorAppTest
{
    private TrevorApp budget;

    @BeforeEach
    public void initialise()
    {
        budget = new TrevorApp();
    }

    @Test
    public void testDisposableIncome()
    {
        Assertions.assertEquals(45.50, budget.disposableIncome(85.50, 40));
    }

    @Test
    public void calculateDisposableIncomeTimeout()
    {
        Assertions.assertTimeout(Duration.ofNanos(1), budget.disposableIncome(85.50, 40) );
    }

    @Test
    public void testIdentity()
    {
        Expense obj = new Expense();
        Assertions.assertSame(obj , budget.readAllExpenses());
    }

    @Test
    public void failingTest()
    {
        Assertions.assertNotEquals(45.50, budget.disposableIncome(85.50, 40));
    }

}