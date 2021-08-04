package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.SignUpCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUpComplete implements Task {
    private String password;
    private String confirmPassword;

    public SignUpComplete(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static SignUpComplete onThePage(String password, String confirmPassword) {
        return Tasks.instrumented(
                SignUpComplete.class,
                password,
                confirmPassword
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpCompletePage.COMPLETE_SETUP_BUTTON),
                Enter.theValue(password).into(SignUpCompletePage.PASSWORD_INPUT),
                Enter.theValue(confirmPassword).into(SignUpCompletePage.CONFIRM_PASSWORD_INPUT)
        );
    }
}
