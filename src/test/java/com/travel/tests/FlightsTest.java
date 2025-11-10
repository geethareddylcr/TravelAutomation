package com.travel.tests;

import com.travel.base.BaseTest;
import com.travel.pages.FlightsPage;
import org.testng.annotations.Test;

public class FlightsTest extends BaseTest {

    @Test
    public void testFlightSearch() throws InterruptedException {
        driver.get("https://www.makemytrip.com/");
        FlightsPage fp = new FlightsPage(driver);

        fp.openFlights();
        Thread.sleep(2000);
    }
}
