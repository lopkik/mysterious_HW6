package Flyweight.Size;

import java.util.HashMap;

public class FontSizeFactory {
    private final HashMap<FontSizeOption, FontSize> fontSizes = new HashMap<>();

    public FontSize getFontSize(FontSizeOption fontSizeOption) {
        if (fontSizes.containsKey(fontSizeOption)) {
            return fontSizes.get(fontSizeOption);
        }

        FontSize fontSize = null;
        if (fontSizeOption.equals(FontSizeOption.fs12)) {
            fontSize = new FontSize12();
        } else if (fontSizeOption.equals(FontSizeOption.fs14)) {
            fontSize = new FontSize14();
        } else if (fontSizeOption.equals(FontSizeOption.fs16)) {
            fontSize = new FontSize16();
        }
        fontSizes.put(fontSizeOption, fontSize);
        return fontSize;
    }
}
