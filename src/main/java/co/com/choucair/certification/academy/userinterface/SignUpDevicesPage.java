package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpDevicesPage {
    public static final Target LAST_STEP_BUTTON = Target
            .the("button that shows us the from to next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']//span[contains(text(), 'Next: Last Step')]"));

    public static final Target YOUR_MOBILE_DEVICE_INPUT = Target
            .the("where do we write the your mobile device")
            .located(By.xpath("//div[@class='mobile-device']//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//div[@class='ui-select-box']"));

    public static final Target MOBILE_INPUT = Target
            .the("where do we write the your mobile device")
            .located(By.xpath("//div[@class='mobile-device']//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//div[@class='ui-select-box']"));

    public static final Target OPERATING_SYSTEM_INPUT = Target
            .the("where do we write the your mobile device")
            .located(By.xpath("//div[@class='mobile-device']//div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//div[@class='ui-select-box']"));

}
