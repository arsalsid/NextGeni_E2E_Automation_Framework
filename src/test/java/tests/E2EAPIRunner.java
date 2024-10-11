package tests;

import api.get.GetBooking;
import api.post.CreateBooking;
import baseTest.DriverFactory;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utils.Utilities;
import java.io.IOException;
import java.lang.reflect.Method;
import static utils.extentReports.ExtentTestManager.startTest;

public class E2EAPIRunner {

    private WebDriver driver = null;

    @Test(description = "Create a new valid Data and GET ID of Details", priority = 1)
    public void createValidDataAndGetIdWithDetails(Method method) throws IOException, InterruptedException {

        try {
            // Create new booking using te POST method
            CreateBooking createBooking = new CreateBooking();
            String bookingId = createBooking.createNewBooking();
//            Utilities.takeScreenshot(driver,"Create new booking request ");
//            startTest(method.getName(), "createValidDataAndGetIdWithDetails");

            // Get booking details using the GET method
            GetBooking getBooking = new GetBooking();
            getBooking.getBookingById(bookingId);
//            Utilities.takeScreenshot(driver,"Fetch booking details from POST request ");
//            startTest(method.getName(), "createValidDataAndGetIdWithDetails");


        }catch (Exception e) {
            System.out.println("Failure Result: " +e.getMessage());
        }
    }

    @Test(description = "Create Invalid Data and GET ID of Details", priority = 2)
    public void createInvalidDataAndGetIdWithDetails (Method method) throws IOException, InterruptedException {
        CreateBooking createBooking = new CreateBooking();
        createBooking.createInvalidBooking();

        GetBooking getBooking = new GetBooking();
        getBooking.getInvalidBooking("##BOOK***");
//        Utilities.takeScreenshot(driver,"Create new booking wirh Invalid request ");
//        startTest(method.getName(), "createValidDataAndGetIdWithDetails");
    }
}
