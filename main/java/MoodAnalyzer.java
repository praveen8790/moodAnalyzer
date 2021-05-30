import java.util.Locale;

public class MoodAnalyzer {

    private final String message;


    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
            if (message.contains("sad"))
                return "Sad";
            return "Happy";
        }

}
