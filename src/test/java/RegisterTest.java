 import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import pages.Main;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

    public class RegisterTest {
        Main main = new Main();

        @Test
        public void testRegisterUser() {
            main.openPage();
            main.clickRegisterLink();
        }
    }

