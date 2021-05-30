
import java.util.Scanner;

public class MoodAnalyzer {

    private final String message;


    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if(message.isEmpty())
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY,"enter valid input");
            if (message.contains("sad"))
                return "Sad";

        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.NULL,"entered NULL input");
        }
      return "Happy";
    }


}
