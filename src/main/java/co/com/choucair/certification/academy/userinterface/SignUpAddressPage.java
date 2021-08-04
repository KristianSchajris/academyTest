package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpAddressPage {
    public static final Target DEVICE_BUTTON = Target
            .the("button that shows us the from to next page")
            .located(By.xpath("//div[@class='btn btn-blue pull-right']//span[contains(text(), 'Next: Devices')]"));

    public static final Target CITY = Target
            .the("where do we write the city")
            .located(By.id("city"));

    public static final Target POSTAL_CODE = Target
            .the("where do we write the postal code")
            .located(By.id("zip"));

    public static final Target COUNTRY = Target
            .the("where do we write the country")
            .located(By.name("countryId"));
}
