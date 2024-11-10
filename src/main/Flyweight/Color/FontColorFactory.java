package Flyweight.Color;

import java.util.HashMap;

public class FontColorFactory {
    private final HashMap<ColorOption, FontColor> fontColors = new HashMap<>();

    public FontColor getColor(ColorOption colorOption) {
        if (fontColors.containsKey(colorOption)) {
            return fontColors.get(colorOption);
        }

        FontColor fontColor = null;
        if (colorOption.equals(ColorOption.Red)) {
            fontColor = new RedFontColor();
        } else if (colorOption.equals(ColorOption.Blue)) {
            fontColor = new BlueFontColor();
        } else if (colorOption.equals(ColorOption.Black)) {
            fontColor = new BlackFontColor();
        }
        fontColors.put(colorOption, fontColor);
        return fontColor;
    }
}
