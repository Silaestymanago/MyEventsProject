package pageObjects;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class MyEventsPage {
    private final SelenideElement ENTER_NAME_PRODUCT = $("[class='TextField__Input-sc-gdowhr-2 hCMtlS']");
    private final ElementsCollection COUNT_ELEMENTS_LIVE_AFTER_SCROLL = $$("[class='Live__StyledLive3ItemRoot-sc-7z5lza-1 dYLfxb']");
    private final SelenideElement LIVE_110 = $("[class='Tab__TabItem-sc-1ke6kso-1 jjLlSk']");
    private final ElementsCollection BUTTON_DRAFT = $$("[class='Tab__TabItem-sc-1ke6kso-1 jiWqQK']");
    private final SelenideElement ELEMENT_NAME = $("[class='Typography__Typ-sc-13nd3m6-0 bBgohu']");
    private final ElementsCollection COUNT_ELEMENTS_DRAFT_AFTER_SCROLL = $$("[class='Live__StyledLive3ItemWrapper-sc-7z5lza-2 dphAng']");
    private final ElementsCollection GET_SELECT_ELEMENT = $$("[class='Typography__Typ-sc-13nd3m6-0 bBgohu']");
    private final SelenideElement TITLE_MY_EVENTS = $x("//div[contains(text(),'My Events')]");
    private final ElementsCollection BUTTON_PAST = $$("[class='Tab__TabItem-sc-1ke6kso-1 jiWqQK']");
    private final ElementsCollection COUNT_ELEMENTS_PAST_AFTER_SCROLL = $$("[class='Live__StyledLive3ItemWrapper-sc-7z5lza-2 dphAng']");
    private final ElementsCollection BUTTON_MANAGE = $$("[id='settings-24px']");
    private final SelenideElement TITLE_EDIT_EVENT = $x("//div[contains(text(),'Edit Event')]");
    private final SelenideElement NAME_SELECTED_ELEMENT = $("[class='Typography__Typ-sc-13nd3m6-0 kDNbzf highlight']");
    private final ElementsCollection BUTTON_VIEW = $$("[class='ToolTip__ToolTipStyledRoot-sc-13wa3zj-1 ibVFKt']");
    private final SelenideElement TITLE_SELECTED_ELEMENT = $("[class='MuiTypography-root MuiTypography-body1 mui-style-1jijec1']");
    private final SelenideElement BUTTON_SELL_TICKETS = $("[id='Contour_15']");
    private final SelenideElement TITLE_PAGE_SELL_TICKETS = $("[class='Typography__Typ-sc-13nd3m6-0 eJTwJU']");
    private final SelenideElement BUTTON_DUPLICATE = $("[id='ic_content_copy_24px']");
    private final SelenideElement TITLE_PAGE_CREATE_EVENT = $("[class='Typography__Typ-sc-13nd3m6-0 eJTwJU']");
    private final ElementsCollection TITLE_ELEMENT = $$("[class='Typography__Typ-sc-13nd3m6-0 bBgohu']");

    @Step("TC-001: Enter name product in the search field")
    public void enterNameProduct(String nameProduct) {
        ENTER_NAME_PRODUCT.click();
        ENTER_NAME_PRODUCT.sendKeys(nameProduct);
        ENTER_NAME_PRODUCT.sendKeys(Keys.ENTER);
    }

    @Step("TC-001:Check that the entered word Laima Vaikule open page with elements Laima Vaijule")
    public String nameElement() {
        return ELEMENT_NAME.getText();
    }

    @Step("TC-002:Check that the page My Events has button LIVE 110")
    public String actualTitleButtonLive() {
        int customTimeoutInSeconds = 20;
        Configuration.timeout = customTimeoutInSeconds * 1500;
        LIVE_110.shouldBe(visible);
        return LIVE_110.getText();
    }

    @Step("TC-002: Check that the elements loaded after scroll up page")
    public int actualCountElementsAfterScrollUp() {
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(10 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(20 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(30 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(40 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(50 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(60 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(70 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(80 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(90 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_LIVE_AFTER_SCROLL.shouldHave(sizeGreaterThan(100 - 1));
        return COUNT_ELEMENTS_LIVE_AFTER_SCROLL.size();
    }

    @Step("TC-003: Click button Draft ")
    public void clickButtonDraft(int buttonIndex) {
        int customTimeInSeconds = 20;
        Configuration.timeout = customTimeInSeconds * 1500;
        BUTTON_DRAFT.get(buttonIndex - 1).click();
    }

    @Step("TC-003:Check that the 147 elements load on the page")
    public int countElementsAfterScroll() {
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(10 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(20 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(30 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(40 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(50 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(60 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(70 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(80 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(90 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.shouldHave(sizeGreaterThan(100 - 1));
        return COUNT_ELEMENTS_DRAFT_AFTER_SCROLL.size();
    }

    @Step("TC-004:Click on the button Past")
    public void clickButtonPast(int buttonIndex) {
        int customTimeSeconds = 10;
        Configuration.timeout = customTimeSeconds * 1500;
        BUTTON_PAST.get(buttonIndex - 1).click();
    }

    @Step("TC-004:Check that the load elements 220 after scroll page Past")
    public int scrollPagePast() {
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(10 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(20 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(30 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(40 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(50 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(60 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(70 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(80 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(90 - 1));
        Selenide.executeJavaScript("window.scrollBy(0, 2200)");
        COUNT_ELEMENTS_PAST_AFTER_SCROLL.shouldHave(sizeGreaterThan(100 - 1));
        return COUNT_ELEMENTS_PAST_AFTER_SCROLL.size();
    }

    @Step("Tc-005:Save the title of the selected element")
    public String titleSelectedElement(int elementIndex) {
        return TITLE_ELEMENT.get(elementIndex - 1).getText();
    }

    @Step("TC-005:Click on the Button Setting")
    public void clickOnTheButtonManage(int buttonIndex) {
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1500;
        TITLE_MY_EVENTS.shouldBe(visible);
        BUTTON_MANAGE.get(buttonIndex).click();
    }

    @Step("TC-005: Check that the button Setting open page Edit Event")
    public String titleEditEvent() {
        return TITLE_EDIT_EVENT.getText();
    }

    @Step("TC-005:Check that the button Setting open page Edit Event for selected element")
    public String nameSelectedElement() {
        return NAME_SELECTED_ELEMENT.getText();
    }

    @Step("TC-006:Select  element on the page My Events")
    public String titleElementOnPageMyEvent(int productIndex) {
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1500;
        GET_SELECT_ELEMENT.shouldHave(sizeGreaterThan(10 - 1));
        return GET_SELECT_ELEMENT.get(productIndex - 1).getText();

    }

    @Step("TC-006:Click on the button View")
    public void clickOnTheButtonView(int productIndex) {
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1000;
        BUTTON_VIEW.get(productIndex - 1).click();
    }

    @Step("TC-006:Check that the description of the element corresponding selected element")
    public String titleSelectedElement() {
        open("https://backery.eventcartel.com/events/test-m2-tickets-8142?promo=64660de0be8987f733915fa9ca359e4d");
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1000;
        return TITLE_SELECTED_ELEMENT.getText();
    }

    @Step("TC-007:Click on the button Sell Tickts")
    public void clickButtonSellTickets() {
        BUTTON_SELL_TICKETS.click();
    }

    @Step("TC-007:Check that the button Sell Tickets open page Sell Tickets")
    public String titlePegaSellTickets() {
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1000;
        TITLE_PAGE_SELL_TICKETS.shouldBe(visible);
        return TITLE_PAGE_SELL_TICKETS.getText();
    }

    @Step("TC-008:Click on the button Duplicate")
    public void clickButtonDuplicate() {
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1000;
        BUTTON_DUPLICATE.shouldBe(visible);
        BUTTON_DUPLICATE.click();
    }

    @Step("TC-008:Check that the button Duplicate open the page Create Event")
    public String actualTitlePageCreateEvent() {
        int customTimeInSeconds = 10;
        Configuration.timeout = customTimeInSeconds * 1000;
        TITLE_PAGE_CREATE_EVENT.shouldBe(visible);
        return TITLE_PAGE_CREATE_EVENT.getText();
    }
}

