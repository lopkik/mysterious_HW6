package Flyweight.Size;

public class FontSize14 implements FontSize {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"font-size:14px\">" + characters + "</span>";
    }
}
