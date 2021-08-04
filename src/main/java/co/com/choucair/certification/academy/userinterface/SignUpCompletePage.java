package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpCompletePage {
    public static final Target COMPLETE_SETUP_BUTTON = Target
            .the("button that shows us the from to next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue']//span[contains(text(), 'Complete Setup')]"));

    public static final Target PASSWORD_INPUT = Target
            .the("where do we write the password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD_INPUT = Target
            .the("where do we write the confirm password")
            .located(By.id("confirmPassword"));
}
