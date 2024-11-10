package Flyweight.Size;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FontSize16Test {

    @Test
    void getAppliedFontString() {
        FontSize16 fontSize16 = new FontSize16();
        String insertedText = "insertedText";

        assertEquals("<span style=\"font-size:16px\">" + insertedText + "</span>", fontSize16.getAppliedFontString(insertedText));
    }
}