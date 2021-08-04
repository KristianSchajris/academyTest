package co.com.choucair.certification.academy.model;

public class TestData {
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;

    private String city;
    private String postalCode;
    private String country;

    private String yourMobileDevice;
    private String model;
    private String operatingSystem;

    private String password;
    private String confirmPassword;

    public TestData(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String city, String postalCode, String country, String yourMobileDevice, String model, String operatingSystem, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.yourMobileDevice = yourMobileDevice;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYourMobileDevice() {
        return yourMobileDevice;
    }

    public void setYourMobileDevice(String yourMobileDevice) {
        this.yourMobileDevice = yourMobileDevice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
