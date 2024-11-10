package Flyweight.Font;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VerdanaFontTest {

    @Test
    void getAppliedFontString() {
        VerdanaFont verdanaFont = new VerdanaFont();
        String insertedText = "insertedText";

        assertEquals("<span style=\"font-family:verdana\">" + insertedText + "</span>", verdanaFont.getAppliedFontString(insertedText));
    }
}