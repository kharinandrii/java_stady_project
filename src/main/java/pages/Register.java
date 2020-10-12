package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Register {
    final SelenideElement advancedButton = $x("//*[@id = 'advancedButton']");
    final SelenideElement exeptionDialog = $x("//*[@id = 'exceptionDialogButton']");
    public void securityPageClose() {
        advancedButton.click();
        exeptionDialog.click();
    }
    public void fillForm() {
        securityPageClose();


    }
}
