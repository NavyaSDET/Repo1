package TestRunners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;

public class AllureListener extends AllureLifecycle implements ITestListener {
    // Implement ITestListener methods to capture test results and attach artifacts
}