package bridgelabzMoodAnalyzer;

public class MoodAnalyzerException extends Exception{
    public enum exceptionType{
        NULL;
    }

    public exceptionType type;

    public MoodAnalyzerException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
