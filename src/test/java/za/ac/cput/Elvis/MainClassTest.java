package za.ac.cput.Elvis;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainClassTest {
    private MainClassTest test;

    public MainClassTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        this.test = new MainClassTest();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("Timeout.");
    }

    @Test

    public void testAddition() {
        int result = test.testingWithTwoNumbers(20, 20);
        assertEquals(40, result);

    }

    private int testingWithTwoNumbers(int i, int i1) {

        return i;
    }
}
