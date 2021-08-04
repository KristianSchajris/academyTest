package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.SignUpDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUpDevice implements Task {
    private String yourMobileDevice;
    private String model;
    private String operatingSystem;

    public SignUpDevice(String yourMobileDevice, String model, String operatingSystem) {
        this.yourMobileDevice = yourMobileDevice;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    public static SignUpDevice onThePage(String yourMobileDevice, String model, String operatingSystem) {
        return Tasks.instrumented(
                SignUpDevice.class,
                yourMobileDevice,
                model,
                operatingSystem
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignUpDevicesPage.LAST_STEP_BUTTON),
                Enter.theValue(yourMobileDevice).into(SignUpDevicesPage.YOUR_MOBILE_DEVICE_INPUT),
                Enter.theValue(model).into(SignUpDevicesPage.MOBILE_INPUT),
                Enter.theValue(operatingSystem).into(SignUpDevicesPage.OPERATING_SYSTEM_INPUT)
        );
    }
}
