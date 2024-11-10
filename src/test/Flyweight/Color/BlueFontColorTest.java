package Flyweight.Color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlueFontColorTest {

    @Test
    void getAppliedFontString() {
        BlueFontColor blueFontColor = new BlueFontColor();
        String insertedText = "insertedText";

        assertEquals("<span style=\"color:blue\">" + insertedText + "</span>", blueFontColor.getAppliedFontString(insertedText));
    }
}