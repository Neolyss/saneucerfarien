package model;

public class Question {
    private String theme;
    private String category;
    private int id;
    private String question;
    private String[] propositions;
    private String answer;

    public Question() {
        //TODO Extract data for a random question and
        // put the corresponding data in the class fields
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getPropositions() {
        return propositions;
    }

    public void setPropositions(String[] propositions) {
        this.propositions = propositions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
