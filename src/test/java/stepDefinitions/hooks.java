package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * Hooks Class
 * ----------------------------
 * This class defines global setup and teardown actions using Cucumber Hooks.
 *
 * - @Before: Runs before each scenario. Can be tagged to apply only for specific scenarios.
 * - @After: Runs after each scenario (cleanup).
 *
 * Execution Order (per scenario):
 *   1. @Before hooks (global or tagged)
 *   2. Background steps (if any)
 *   3. Scenario steps
 *   4. @After hooks (global)
 *
 * Purpose in this project:
 *   - Setup test data or environment before executing a scenario.
 *   - Clean up after scenario execution.
 */
public class hooks {

    /**
     * Runs BEFORE any scenario tagged with @NetBanking.
     * Example use: Initialize database entries or configurations specific to NetBanking tests.
     */
    @Before("@NetBanking")
    public void netBankingSetup() {
        System.out.println("*****************************************");
        System.out.println("Setup the entries in Net Banking database");
    }

    /**
     * Runs BEFORE any scenario tagged with @Mortgage.
     * Example use: Prepare test data or environment for Mortgage-related scenarios.
     */
    @Before("@Mortgage")
    public void mortgageSetup() {
        System.out.println("**************************************");
        System.out.println("Setup the entries in Mortgage database");
    }

    /**
     * Runs AFTER every scenario (regardless of tag).
     * Example use: Clear temporary data, reset environment, or close connections.
     */
    @After
    public void tearDown() {
        System.out.println("*****************");
        System.out.println("Clear the entries");
    }
}
