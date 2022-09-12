package bridgelabzMoodAnalyzer;

public class MoodAnalyzer {
    String message;
    public static void main(String[] args) {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String happyMood = moodAnalyser.analyseMood();
        System.out.println("Mood is "+happyMood);
        String sadMood = moodAnalyser.analyseMood();
        System.out.println("Mood is "+sadMood);

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }
    public MoodAnalyzer() {
    }

    public String analyseMood(){
        if(message.toLowerCase().contains("sad"))
            return "SAD";
        else
            return "HAPPY";

    }
}
