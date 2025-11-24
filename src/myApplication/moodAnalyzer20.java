package moodAnalyzer;

public class moodAnalyzer20 {
    private String message;

    public moodAnalyzer20(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message == null || message.isEmpty()) return "HAPPY";
        if (message.toLowerCase().contains("sad")) return "SAD";
        return "HAPPY";
    }
}
