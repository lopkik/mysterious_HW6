package Flyweight.Font;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArialFontTest {

    @Test
    void getAppliedFontString() {
        ArialFont arialFont = new ArialFont();
        String insertedText = "insertedText";

        assertEquals("<span style=\"font-family:arial\">" + insertedText + "</span>", arialFont.getAppliedFontString(insertedText));
    }
}