package Flyweight.Font;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FontFactoryTest {

    @Test
    void getFont() {
        FontFactory fontFactory = new FontFactory();

        Font arial = fontFactory.getFont(FontOption.Arial);
        Font arial_again = fontFactory.getFont(FontOption.Arial);
        assertSame(arial, arial_again);

        Font calibri = fontFactory.getFont(FontOption.Calibri);
        Font calibri_again = fontFactory.getFont(FontOption.Calibri);
        assertSame(calibri, calibri_again);

        Font verdana = fontFactory.getFont(FontOption.Verdana);
        Font verdana_again = fontFactory.getFont(FontOption.Verdana);
        assertSame(verdana, verdana_again);
    }
}