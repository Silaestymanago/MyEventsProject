package pageObjects;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private final SelenideElement BUTTON_USER = $("[class='MuiBadge-root mui-style-1p53wq7']");
    private final SelenideElement ENTER_EMAIL = $("[class='MuiInputBase-input mui-style-tnuk42']");
    private final SelenideElement ENTER_PASSWORD = $x("//input[@id='field-password']");
    private final SelenideElement BUTTON_LOGIN = $x("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained_ffffff_3a66e5_3a66e5 MuiButton-contained_ffffff_3a66e5_3a66e5Primary MuiButton-sizeMedium MuiButton-contained_ffffff_3a66e5_3a66e5SizeMedium MuiButton-root MuiButton-contained_ffffff_3a66e5_3a66e5 MuiButton-contained_ffffff_3a66e5_3a66e5Primary MuiButton-sizeMedium MuiButton-contained_ffffff_3a66e5_3a66e5SizeMedium mui-style-1b323c2']");
    private final SelenideElement CUSTOMER_AVATAR = $("[class='MuiAvatar-root MuiAvatar-circular mui-style-unenx2']");
    private final ElementsCollection BUTTON_ORGANIZER_DASHBOARD = $$("[class='MuiTypography-root MuiTypography-span mui-style-lvj1p1']");
    private final ElementsCollection BUTTON_EVENTS = $$("[class='DrawerItem__Wrapper-sc-1rs5947-0 gNeivt']");

    public void openHomePage() {
        open("https://backery.eventcartel.com/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @Step("TC-001:Click on the button LogIn")
    public void clickOnTheLogIn() {
        BUTTON_USER.click();
    }

    @Step("TC-001:In the field Email Address enter email")
    public void enterEmail(String email) {
        ENTER_EMAIL.click();
        ENTER_EMAIL.sendKeys(email);
    }

    @Step("TC-001:In the field Password enter password")
    public void enterPassword(String password) {
        ENTER_PASSWORD.click();
        ENTER_PASSWORD.sendKeys(password);
    }

    @Step("TC-001:Click on the button Log In")
    public void clickOnTheButtonLogIn() {
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1000;
        BUTTON_LOGIN.shouldBe(Condition.visible);
        BUTTON_LOGIN.click();
    }

    @Step("TC-001:Click on the button Customer LogIn")
    public void customerAvatar() {
        CUSTOMER_AVATAR.shouldBe(Condition.visible);
        CUSTOMER_AVATAR.hover();
    }

    @Step("TC-001:Click on the button Organizer Dashboard in the popup Customer Avatar")
    public void buttonOrganizerDashboard() {
        BUTTON_ORGANIZER_DASHBOARD.get(5).click();
    }

    @Step("TC-001 Click on the button Events")
    public void buttonEvents() {
        BUTTON_EVENTS.get(1).click();

    }

}

