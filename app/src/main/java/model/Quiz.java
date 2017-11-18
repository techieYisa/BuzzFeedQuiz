package model;

/**
 * Created by c4q on 11/18/17.
 */

public class Quiz {
    int background;
    String question;
    String options;

    public Quiz(int background, String question, String options) {
        this.background = background;
        this.question = question;
        this.options = options;

    }

    public int getBackground() {
        return background;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptions() {
        return options;
    }
}
