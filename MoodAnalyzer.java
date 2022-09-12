package bridgelabzMoodAnalyzer;

public class MoodAnalyzr {
    String message;
    public MoodAnalyzr(String message) {
        this.message=message;
    }
    public MoodAnalyzr() {
    }
    public String analyzeMood() 
        try {
            if(message.contains("sad")){
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch(Exception e) {
           return "HAPPY"
        }
    }
}
