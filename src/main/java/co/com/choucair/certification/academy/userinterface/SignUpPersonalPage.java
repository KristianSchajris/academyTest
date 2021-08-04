package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPersonalPage {
    public static final Target LOCATION_BUTTON = Target
            .the("button that shows us the from to next step")
            .located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']//span[contains(text(), 'Next: Location')]"));

    public static final Target FIRST_NAME_INPUT = Target
            .the("where do we write the first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME_INPUT = Target
            .the("where do we write the last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_INPUT = Target
            .the("where do we write the email")
            .located(By.id("email"));

    public static final Target BIRTH_MONTH_SELECT = Target
            .the("Where we select the month of birth")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_DAY_SELECT = Target
            .the("Where we select the day of birth")
            .located(By.id("birthDay"));

    public static final Target BIRTH_YEAR_SELECT = Target
            .the("Where we select the year of birth")
            .located(By.id("birthYear"));

}
