package Flyweight.Size;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FontSizeFactoryTest {

    @Test
    void getFontSize() {
        FontSizeFactory fontSizeFactory = new FontSizeFactory();

        FontSize fs12 = fontSizeFactory.getFontSize(FontSizeOption.fs12);
        FontSize fs12_again = fontSizeFactory.getFontSize(FontSizeOption.fs12);
        assertSame(fs12, fs12_again);

        FontSize fs14 = fontSizeFactory.getFontSize(FontSizeOption.fs14);
        FontSize fs14_again = fontSizeFactory.getFontSize(FontSizeOption.fs14);
        assertSame(fs14, fs14_again);

        FontSize fs16 = fontSizeFactory.getFontSize(FontSizeOption.fs16);
        FontSize fs16_again = fontSizeFactory.getFontSize(FontSizeOption.fs16);
        assertSame(fs16, fs16_again);
    }
}