import Flyweight.Color.BlackFontColorTest;
import Flyweight.Color.BlueFontColorTest;
import Flyweight.Color.FontColorFactoryTest;
import Flyweight.Color.RedFontColorTest;
import Flyweight.Font.ArialFontTest;
import Flyweight.Font.CalibriFontTest;
import Flyweight.Font.FontFactoryTest;
import Flyweight.Font.VerdanaFontTest;
import Flyweight.FontCharacterTest;
import Flyweight.Size.FontSize12Test;
import Flyweight.Size.FontSize14Test;
import Flyweight.Size.FontSize16Test;
import Flyweight.Size.FontSizeFactoryTest;
import Proxy.SongServiceProxyTest;
import Proxy.SongServiceServerTest;
import Proxy.SongTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        RedFontColorTest.class, BlueFontColorTest.class, BlackFontColorTest.class, FontColorFactoryTest.class,
        ArialFontTest.class, CalibriFontTest.class, VerdanaFontTest.class, FontFactoryTest.class,
        FontSize12Test.class, FontSize14Test.class, FontSize16Test.class, FontSizeFactoryTest.class,
        FontCharacterTest.class,
        SongTest.class, SongServiceServerTest.class, SongServiceProxyTest.class
})
public class SuiteTest {
}
