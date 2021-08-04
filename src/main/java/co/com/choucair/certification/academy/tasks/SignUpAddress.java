package co.com.choucair.certification.academy.tasks;


import co.com.choucair.certification.academy.userinterface.SignUpAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUpAddress implements Task {
    private String city;
    private String postalCode;
    private String country;

    public SignUpAddress(String city, String postalCode, String country) {
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public static SignUpAddress onThePage(String city, String postalCode, String country) {
        return Tasks.instrumented(
                SignUpAddress.class,
                city,
                postalCode,
                country
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpAddressPage.DEVICE_BUTTON),
                Enter.theValue(city).into(SignUpAddressPage.CITY),
                Enter.theValue(postalCode).into(SignUpAddressPage.POSTAL_CODE),
                Enter.theValue(country).into(SignUpAddressPage.COUNTRY)
        );
    }
}
