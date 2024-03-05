package bank;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    BankAccount bankAccount;

    @BeforeEach
    void setup() {
        bankAccount = new BankAccount(1000);
    }

    @Test
    @DisplayName("GetBalance correcto")
    void getBalanceCorrecto(){
        int obtainedValue = bankAccount.getBalance();
        int expectedValue = 1000;

        assertEquals(obtainedValue, expectedValue);
    }

    @Test
    @DisplayName("Withdraw correcto")
    void withdrawPositivoCorrecto(){
        boolean obtainedBoolean = bankAccount.withdraw(100);
        int obtainedValue = bankAccount.getBalance();
        boolean expectedBoolean = true;
        int expectedValue = 900;

        assertEquals(obtainedValue, expectedValue);
        assertEquals(obtainedBoolean, expectedBoolean);
    }

    @Test
    @DisplayName("Withdraw negativo")
    void withdrawNegativo(){
        boolean obtainedBoolean = bankAccount.withdraw(10000);
        int obtainedValue = bankAccount.getBalance();
        boolean expectedBoolean = false;
        int expectedValue = 1000;

        assertEquals(obtainedValue, expectedValue);
        assertEquals(obtainedBoolean, expectedBoolean);
    }

    @Test
    @DisplayName("Deposit correcto")
    void depositCorrecto(){
        int obtainedValue = bankAccount.deposit(100);
        int expectedValue = 1100;

        assertEquals(obtainedValue, expectedValue);
    }

    @Test
    @DisplayName("Deposit negativo")
    void depositNegativo(){
        assertThrows(IllegalArgumentException.class, () -> {
            bankAccount.deposit(-100);
        });
    }

    @Test
    @DisplayName("Payment correcto")
    void paymentCorrecto(){
        double obtainedValue = bankAccount.payment(10000, 0.001, 12);
        double expectedValue = 838.759926;

        assertEquals(obtainedValue, expectedValue, 0.01);
    }

    @Test 
    @DisplayName("Pending correcto")
    void pendingCorrecto(){
        double obtainedValue = bankAccount.pending(10000, 0.001, 12, 2);
        double expectedValue = 8341.651389;

        assertEquals(obtainedValue, expectedValue, 0.01);
    }

    @AfterAll
    static void tearDown() {
        BankMain main = new BankMain();
        main.main(null);
    }
}
