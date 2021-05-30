 public class MoodAnalyzerException extends Exception{
        enum ExceptionType {
            NULL,EMPTY;
        }
        ExceptionType type;
        public MoodAnalyzerException(ExceptionType Type, String message) {
            super(message);
            this.type = Type;
        }
}