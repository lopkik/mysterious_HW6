package Flyweight.Font;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalibriFontTest {

    @Test
    void getAppliedFontString() {
        CalibriFont calibriFont = new CalibriFont();
        String insertedText = "insertedText";

        assertEquals("<span style=\"font-family:calibri\">" + insertedText + "</span>", calibriFont.getAppliedFontString(insertedText));
    }
}