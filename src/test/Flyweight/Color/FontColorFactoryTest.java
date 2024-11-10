package Flyweight.Color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FontColorFactoryTest {

    @Test
    void getColor() {
        FontColorFactory fontColorFactory = new FontColorFactory();

        FontColor red = fontColorFactory.getColor(ColorOption.Red);
        FontColor red_again = fontColorFactory.getColor(ColorOption.Red);
        assertSame(red, red_again);

        FontColor blue = fontColorFactory.getColor(ColorOption.Blue);
        FontColor blue_again = fontColorFactory.getColor(ColorOption.Blue);
        assertSame(blue, blue_again);

        FontColor black = fontColorFactory.getColor(ColorOption.Black);
        FontColor black_again = fontColorFactory.getColor(ColorOption.Black);
        assertSame(black, black_again);
    }
}