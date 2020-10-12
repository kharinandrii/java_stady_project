package pages;
import Tools.Helpers;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Main extends Helpers {
    public void openPage() {
        open("/");
    }


    public void clickRegisterLink() {
        $(By.xpath("//*[text() = 'My Account']")).click();
        $(By.xpath("//*[text() = 'Register']")).click();
        new Register().fillForm();
    }
}
