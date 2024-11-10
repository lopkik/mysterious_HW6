package Flyweight.Size;

public class FontSize16 implements FontSize {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"font-size:16px\">" + characters + "</span>";
    }
}
