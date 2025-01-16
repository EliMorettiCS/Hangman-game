import java.text.ListFormat;
import java.util.Scanner;

public class Settings
{
    // Attributes
    private boolean style = true;
    private boolean speech = true;
    // Constructers
    public Settings()
    {

    }

    // Accessors
    public boolean getStyleSetting() {
        return style;
    }
    public boolean getSpeechSetting() {
        return speech;
    }

    public void toggleStyleSetting() {
        if (style == true) {
            style = false;
        }
        else {
            style = true;
        }
    }
    public void toggleSpeechSetting() {
        if (speech == true) {
            speech = false;
        }
        else {
            speech = true;
        }
    }
    // Mutators
}