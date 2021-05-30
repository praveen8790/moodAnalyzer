import java.util.Locale;

public class MoodAnalyzer {

    private final String message;


    public MoodAnalyzer(String message) throws MoodAnalyzerException {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if (message.contains("sad"))
                return "Sad";
            return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }

    }
}
