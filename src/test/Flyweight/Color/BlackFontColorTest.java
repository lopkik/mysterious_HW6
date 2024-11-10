package Flyweight.Color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlackFontColorTest {

    @Test
    void getAppliedFontString() {
        BlackFontColor blackFontColor = new BlackFontColor();
        String insertedText = "insertedText";

        assertEquals("<span style=\"color:black\">" + insertedText + "</span>", blackFontColor.getAppliedFontString(insertedText));
    }
}