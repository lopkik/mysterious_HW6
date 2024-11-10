package Flyweight.Font;

public class CalibriFont implements Font {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"font-family:calibri\">" + characters + "</span>";
    }
}
