package Flyweight.Font;

public class ArialFont implements Font {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"font-family:arial\">" + characters + "</span>";
    }
}
