package Flyweight.Size;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FontSize14Test {

    @Test
    void getAppliedFontString() {
        FontSize14 fontSize14 = new FontSize14();
        String insertedText = "insertedText";

        assertEquals("<span style=\"font-size:14px\">" + insertedText + "</span>", fontSize14.getAppliedFontString(insertedText));
    }
}