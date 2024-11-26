package ca.nl.cna.ethan.drover.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Account class.
 * Includes tests for getters, setters, constructor behavior, and deposit functionality.
 */
class AccountTest {

    private Account account;

    /**
     * Sets up an Account object with an initial balance of 100.0 for testing.
     */
    @BeforeEach
    void setUp() {
        account = new Account("Test Account", 100.0);
    }

    /**
     * Tests the getName method, makes sure it returns the correct account name.
     */
    @Test
    void getName() {
        assertEquals("Test Account", account.getName(), "The account name should be 'Test Account'.");
    }

    /**
     * Tests the setName method, makes sure the account name can be updated correctly.
     */
    @Test
    void setName() {
        account.setName("Updated Account");
        assertEquals("Updated Account", account.getName(), "The account name should be updated to 'Updated Account'.");
    }

    /**
     * Tests the getBalance method, makes sure it returns the correct balance.
     */
    @Test
    void getBalance() {
        assertEquals(100.0, account.getBalance(), "The initial balance should be 100.0.");
    }

    /**
     * Tests the deposit method to ensure:
     * Positive amounts are added to the balance correctly.
     * Negative amounts do not affect the balance.
     */
    @Test
    void deposit() {
        // Test credit positive amount (works)
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), "The balance should be updated to 150.0 after depositing 50.0.");

        // Test credit negative amount (ignored)
        account.deposit(-50.0);
        assertEquals(150.0, account.getBalance(), "The balance should remain 150.0 when depositing a negative amount.");
    }

    /**
     * Tests the Account constructor to ensure that negative balances are set to 0.
     */
    @Test
    void testNegativeBalanceInConstructor() {
        Account negativeBalanceAccount = new Account("Negative Balance", -50.0);
        assertEquals(0.0, negativeBalanceAccount.getBalance(), "The balance should default to 0 for negative initial values.");
    }

    /**
     * Tests the execution procedure, verifying:
     * - Correct account creation with an initial balance.
     * - Positive deposits update the balance correctly.
     * - Negative deposits are ignored.
     * - Final balance matches expected results.
     */
    @Test
    void testExecutionProcedure() {
        // Creation of account with correct balance
        Account testAccount = new Account("Execution Test", 200.0);
        assertEquals(200.0, testAccount.getBalance(), "The initial balance should be 200.0.");

        // Credit positive amount (works)
        testAccount.deposit(100.0);
        assertEquals(300.0, testAccount.getBalance(), "The balance should be updated to 300.0 after depositing 100.0.");

        // Credit negative amount (ignored)
        testAccount.deposit(-50.0);
        assertEquals(300.0, testAccount.getBalance(), "The balance should remain 300.0 when depositing a negative amount.");

        // Correct final balance
        assertEquals(300.0, testAccount.getBalance(), "The final balance should be 300.0.");
    }
}
