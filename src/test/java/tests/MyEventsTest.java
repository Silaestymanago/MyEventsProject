package tests;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.HomePage;
import pageObjects.MyEventsPage;

public class MyEventsTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    HomePage homePage = new HomePage();
    MyEventsPage myEventsPage = new MyEventsPage();

    @Test(description = "TC-001;Field search")
    @Description("Find a product through the search field")
    public void test_01_buttonOrganizerDashboard() {
        homePage.openHomePage();
        homePage.clickOnTheLogIn();
        String email = "admin@rusangeles.com";
        homePage.enterEmail(email);
        String password = "Aivai4oo1";
        homePage.enterPassword(password);
        homePage.clickOnTheButtonLogIn();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();

        String nameProduct = "Laima Vaikule ";
        myEventsPage.enterNameProduct(nameProduct);
        String actualNameElement = myEventsPage.nameElement();
        Assert.assertTrue(actualNameElement.contains(nameProduct));
    }

    @Test(description = "TC-002;Button Live")
    @Description("Check that the elements correctly load after the page scroll up")
    public void test_02_buttonLive() {
        homePage.openHomePage();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();

        String expectedTitleButtonLive = "LIVE 0";
        String actualTitleButtonLive = myEventsPage.actualTitleButtonLive();
        softAssert.assertEquals(actualTitleButtonLive, expectedTitleButtonLive);

        int expectedCountElementsAfterScrollLive = 100;
        int actualCountElementsAfterScrollLive = myEventsPage.actualCountElementsAfterScrollUp();
        softAssert.assertEquals(actualCountElementsAfterScrollLive, expectedCountElementsAfterScrollLive);
        softAssert.assertAll();

    }

    @Test(description = "TC-003;Button DRAFT ")
    @Description("Check that the elements correctly load after the page scroll up")
    public void test_03_buttonDraft() {
        homePage.openHomePage();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();
        int buttonIndex = 1;
        myEventsPage.clickButtonDraft(buttonIndex);

        int expectedCountElementsAfterScrollDraft = 100;
        int actualCountElementsAfterScrollDraft = myEventsPage.countElementsAfterScroll();
        Assert.assertEquals(actualCountElementsAfterScrollDraft, expectedCountElementsAfterScrollDraft);


    }

    @Test(description = "TC-004;Button PAST")
    @Description("Check that the elements correctly load after the page scroll up")
    public void test_04_buttonPast() {
        homePage.openHomePage();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();
        int buttonIndex = 2;
        myEventsPage.clickButtonPast(buttonIndex);

        int expectedCountElementsAfterScrollPast = 100;
        int actualCountElementsAfterScrollPast = myEventsPage.scrollPagePast();
        Assert.assertEquals(actualCountElementsAfterScrollPast, expectedCountElementsAfterScrollPast);

    }

    @Test(description = "TC-005; Button Manage")
    @Description("Check that the button Manage open page Edit Event for selected element")
    public void test_05_buttonManage() {
        homePage.openHomePage();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();

        int elementIndexToGetTitle = 2;
        String getTitleElementFromMyEventsPage = myEventsPage.titleSelectedElement(elementIndexToGetTitle);

        int buttonIndex = 1;
        myEventsPage.clickOnTheButtonManage(buttonIndex);

        String expectedTitleEditEvent = "Edit Event";
        String actualTitleEditEvent = myEventsPage.titleEditEvent();
        softAssert.assertEquals(actualTitleEditEvent, expectedTitleEditEvent);

        String titleElementFromSettingPage = myEventsPage.nameSelectedElement();
        softAssert.assertTrue(titleElementFromSettingPage.contains(getTitleElementFromMyEventsPage));

        softAssert.assertAll();

    }

    @Test(description = "TC-006;Button View")
    @Description("Check that the description of the element corresponding selected element for View")
    public void test_06_buttonView() {
        homePage.openHomePage();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();

        int productIndexToGetTitle = 2;
        String getTitleElementFromMyEventsPage = myEventsPage.titleElementOnPageMyEvent(productIndexToGetTitle);

        int buttonIndexView = 5;
        myEventsPage.clickOnTheButtonView(buttonIndexView);
        String titleElementFromViewPage = myEventsPage.titleSelectedElement();
        Assert.assertTrue(titleElementFromViewPage.contains(getTitleElementFromMyEventsPage));

    }

    @Test(description = "TC-007:Button Sell Tickets")
    @Description("Check that the button Sell Tickets open page Sell Tickets")
    public void test_07_buttonSellTickets() {
        homePage.openHomePage();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();
        myEventsPage.clickButtonSellTickets();

        String expectedTitlePageSellTickets = "Sell Tickets";
        String actualTitlePageSellTickets = myEventsPage.titlePegaSellTickets();
        Assert.assertEquals(actualTitlePageSellTickets, expectedTitlePageSellTickets);
    }

    @Test(description = "TC-008:Button Duplicate")
    @Description("Check that the button Duplicate open the page Create Event")
    public void test_08_buttonDuplicate() {
        homePage.openHomePage();
        homePage.customerAvatar();
        homePage.buttonOrganizerDashboard();
        homePage.buttonEvents();
        myEventsPage.clickButtonDuplicate();

        String expectedTitlePage = "Create Event";
        String actualTitlePage = myEventsPage.actualTitlePageCreateEvent();
        Assert.assertEquals(actualTitlePage, expectedTitlePage);
    }

}