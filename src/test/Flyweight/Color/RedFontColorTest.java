package Flyweight.Color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RedFontColorTest {

    @Test
    void getAppliedFontString() {
        RedFontColor redFontColor = new RedFontColor();
        String insertedText = "insertedText";

        assertEquals("<span style=\"color:red\">" + insertedText + "</span>", redFontColor.getAppliedFontString(insertedText));
    }
}