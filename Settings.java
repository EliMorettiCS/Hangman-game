public class Settings
{
    // Attributes
    private boolean style = true;
    private boolean speech = true;
    // Constructers
    public Settings()
    {
        this.style = style;
        this.speech = speech;
    }

    // Accessors
    public boolean getStyleSetting() {
        return this.style;
    }
    public boolean getSpeechSetting() {
        return this.speech;
    }

    public void toggleStyleSetting() {
        if (this.style == true) {
            this.style = false;
        }
        else {
            this.style = true;
        }
    }
    public void toggleSpeechSetting() {
        if (this.speech == true) {
            this.speech = false;
        }
        else {
            this.speech = true;
        }
    }
    // Mutators
}