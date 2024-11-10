package Flyweight.Font;

import java.util.HashMap;

public class FontFactory {
    private final HashMap<FontOption, Font> fonts = new HashMap<>();

    public Font getFont(FontOption fontOption) {
        if (fonts.containsKey(fontOption)) {
            return fonts.get(fontOption);
        }

        Font font = null;
        if (fontOption.equals(FontOption.Arial)) {
            font = new ArialFont();
        } else if (fontOption.equals(FontOption.Calibri)) {
            font = new CalibriFont();
        } else if (fontOption.equals(FontOption.Verdana)) {
            font = new VerdanaFont();
        }
        fonts.put(fontOption, font);
        return font;
    }
}
