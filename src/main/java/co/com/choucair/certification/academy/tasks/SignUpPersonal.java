package co.com.choucair.certification.academy.tasks;


import co.com.choucair.certification.academy.userinterface.SignUpPersonalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUpPersonal implements Task {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;

    public SignUpPersonal(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public static SignUpPersonal onThePage(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear) {
        return Tasks.instrumented(
                SignUpPersonal.class,
                firstName,
                lastName,
                email,
                birthMonth,
                birthDay,
                birthYear
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpPersonalPage.LOCATION_BUTTON),
                Enter.theValue(firstName).into(SignUpPersonalPage.FIRST_NAME_INPUT),
                Enter.theValue(lastName).into(SignUpPersonalPage.LAST_NAME_INPUT),
                Enter.theValue(email).into(SignUpPersonalPage.EMAIL_INPUT),
                Enter.theValue(birthMonth).into(SignUpPersonalPage.BIRTH_MONTH_SELECT),
                Enter.theValue(birthDay).into(SignUpPersonalPage.BIRTH_DAY_SELECT),
                Enter.theValue(birthYear).into(SignUpPersonalPage.BIRTH_YEAR_SELECT)
        );
    }
}
