import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class WebSimpleTests extends TestBase {

    @Test
    void webTestOne() {
        Selenide.open("https://shashlik.club/");
        $x("//a[@href='https://shashlik.club/']").
                shouldHave(Condition.exactText("Доставка шашлыка"));
    }

    @Test
    void webTestTwo() {

        Selenide.open("https://shashlik.club/");
        $("h1").shouldHave(Condition.exactText("Шашлык от кафе Ратибор"));
    }

}
