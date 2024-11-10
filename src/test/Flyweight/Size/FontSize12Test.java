package Flyweight.Size;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FontSize12Test {

    @Test
    void getAppliedFontString() {
        FontSize12 fontSize12 = new FontSize12();
        String insertedText = "insertedText";

        assertEquals("<span style=\"font-size:12px\">" + insertedText + "</span>", fontSize12.getAppliedFontString(insertedText));
    }
}