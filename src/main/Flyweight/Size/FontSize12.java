package Flyweight.Size;

public class FontSize12 implements FontSize {
    @Override
    public String getAppliedFontString(String characters) {
        return "<span style=\"font-size:12px\">" + characters + "</span>";
    }
}
