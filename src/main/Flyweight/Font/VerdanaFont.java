package Flyweight.Font;

public class VerdanaFont implements Font {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"font-family:verdana\">" + characters + "</span>";
    }
}
