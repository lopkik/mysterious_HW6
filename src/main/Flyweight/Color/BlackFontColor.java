package Flyweight.Color;

public class BlackFontColor implements FontColor {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"color:black\">" + characters + "</span>";
    }
}
