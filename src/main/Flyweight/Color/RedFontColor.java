package Flyweight.Color;

public class RedFontColor implements FontColor {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"color:red\">" + characters + "</span>";
    }
}
