package Flyweight;

import Flyweight.Color.ColorOption;
import Flyweight.Color.FontColorFactory;
import Flyweight.Font.FontFactory;
import Flyweight.Font.FontOption;
import Flyweight.Size.FontSizeFactory;
import Flyweight.Size.FontSizeOption;

import java.io.FileWriter;

public class FlyweightDriver {
    public static void main (String[] args) {
        FontFactory fontFactory = new FontFactory();
        FontColorFactory fontColorFactory = new FontColorFactory();
        FontSizeFactory fontSizeFactory = new FontSizeFactory();

        try {
            FileWriter fileWriter = new FileWriter("src/main/Flyweight/input.txt");
            fileWriter.write("HelloWorldCS5800");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("FileWriter error: " + e);
        }

        FontCharacter inputCharacters = new FontCharacter("src/main/Flyweight/input.txt");
        inputCharacters.setFontFamily(fontFactory.getFont(FontOption.Arial));
        inputCharacters.setFontColor(fontColorFactory.getColor(ColorOption.Red));
        inputCharacters.setFontSize(fontSizeFactory.getFontSize(FontSizeOption.fs12));
        inputCharacters.writeToFile("src/main/Flyweight/output1.txt");

        inputCharacters.setFontFamily(fontFactory.getFont(FontOption.Calibri));
        inputCharacters.setFontColor(fontColorFactory.getColor(ColorOption.Blue));
        inputCharacters.setFontSize(fontSizeFactory.getFontSize(FontSizeOption.fs14));
        inputCharacters.writeToFile("src/main/Flyweight/output2.txt");

        inputCharacters.setFontFamily(fontFactory.getFont(FontOption.Verdana));
        inputCharacters.setFontColor(fontColorFactory.getColor(ColorOption.Black));
        inputCharacters.setFontSize(fontSizeFactory.getFontSize(FontSizeOption.fs16));
        inputCharacters.writeToFile("src/main/Flyweight/output3.txt");

        inputCharacters.setFontFamily(fontFactory.getFont(FontOption.Arial));
        inputCharacters.setFontColor(fontColorFactory.getColor(ColorOption.Blue));
        inputCharacters.setFontSize(fontSizeFactory.getFontSize(FontSizeOption.fs16));
        inputCharacters.writeToFile("src/main/Flyweight/output4.txt");
    }
}
