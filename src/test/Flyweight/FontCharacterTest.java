package Flyweight;

import Flyweight.Color.ColorOption;
import Flyweight.Color.FontColorFactory;
import Flyweight.Font.FontFactory;
import Flyweight.Font.FontOption;
import Flyweight.Size.FontSizeFactory;
import Flyweight.Size.FontSizeOption;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class FontCharacterTest {
    static String inputFileText = "HelloWorldCS5800Test";
    static String inputPath = "src/test/Flyweight/input.txt";
    String outputPath = "src/test/Flyweight/output.txt";

    @BeforeAll
    static void setUp() {
        try {
            FileWriter fileWriter = new FileWriter(inputPath);
            fileWriter.write(inputFileText);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("FileWriter error: " + e);
        }
    }

    @Test
    void setFontFamily() {
        FontFactory fontFactory = new FontFactory();
        FontCharacter fontCharacter = new FontCharacter(inputPath);
        fontCharacter.setFontFamily(fontFactory.getFont(FontOption.Arial));

        assertNotNull(fontCharacter.getFontFamily());
        assertSame(fontFactory.getFont(FontOption.Arial), fontCharacter.getFontFamily());
    }

    @Test
    void setFontColor() {
        FontColorFactory fontColorFactory = new FontColorFactory();
        FontCharacter fontCharacter = new FontCharacter(inputPath);
        fontCharacter.setFontColor(fontColorFactory.getColor(ColorOption.Red));

        assertNotNull(fontCharacter.getFontColor());
        assertSame(fontColorFactory.getColor(ColorOption.Red), fontCharacter.getFontColor());
    }

    @Test
    void setFontSize() {
        FontSizeFactory fontSizeFactory = new FontSizeFactory();
        FontCharacter fontCharacter = new FontCharacter(inputPath);
        fontCharacter.setFontSize(fontSizeFactory.getFontSize(FontSizeOption.fs16));

        assertNotNull(fontCharacter.getFontSize());
        assertSame(fontSizeFactory.getFontSize(FontSizeOption.fs16), fontCharacter.getFontSize());
    }

    @Test
    void writeToFile() {
        FontCharacter fontCharacter = new FontCharacter(inputPath);
        fontCharacter.writeToFile(outputPath);

        String outputFileText = "";
        try {
            File myObj = new File(outputPath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                outputFileText = myReader.nextLine();
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("File error: " + e);
        }
        assertEquals(inputFileText, outputFileText);
    }
}