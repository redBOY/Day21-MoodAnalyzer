package bridgelabzMoodAnalyzer;

public class MoodAnalyzr {
    String message;
    public MoodAnalyzr(String message) {
        this.message=message;
    }
    public MoodAnalyzr() {
    }
    public String analyzeMood() throws MoodAnalyzerException {
        try {
            if(message.contains("sad")){
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch(Exception e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.NULL,("Message is Null"));
        }
    }
}

