package Flyweight.Color;

public class BlueFontColor implements FontColor {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"color:blue\">" + characters + "</span>";
    }
}
