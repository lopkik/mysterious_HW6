package Flyweight;

import Flyweight.Color.FontColor;
import Flyweight.Font.Font;
import Flyweight.Size.FontSize;

import java.io.*;
import java.util.Scanner;

public class FontCharacter {
    private String fontCharacters = "";
    private Font fontFamily = null;
    private FontColor fontColor = null;
    private FontSize fontSize = null;

    public FontCharacter (String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                this.fontCharacters = myReader.nextLine();
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("File error: " + e);
        }
    }

    public void setFontFamily(Font fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontColor(FontColor fontColor) {
        this.fontColor = fontColor;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    public Font getFontFamily() {
        return fontFamily;
    }

    public FontColor getFontColor() {
        return fontColor;
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void writeToFile(String outFileName) {
        String outputCharacters = this.fontCharacters;
        if (this.fontFamily != null) {
            outputCharacters = this.fontFamily.getAppliedFontString(outputCharacters);
        }
        if (this.fontColor != null) {
            outputCharacters = this.fontColor.getAppliedFontString(outputCharacters);
        }
        if (this.fontSize != null) {
            outputCharacters = this.fontSize.getAppliedFontString(outputCharacters);
        }

        try {
            FileWriter fileWriter = new FileWriter(outFileName);
            fileWriter.write(outputCharacters);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("FileWriter error: " + e);
        }
    }
}
