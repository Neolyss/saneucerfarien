package model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;

public class Question {
    private String theme;
    private String category;
    private int id;
    private String question;
    private String[] propositions;
    private String answer;
    private String level;

    public Question() throws Exception {
        ArrayList<String> list = lsDir(treeQuestion(null));
        theme = list.get((int)(Math.random() * list.size()));

        list = lsDir(treeQuestion(new String[]{theme}));
        category = list.get((int)(Math.random() * list.size()));

        System.out.println("theme "+ theme+" / category "+category);
        System.out.println(treeQuestion(new String[] {theme, category}).exists());
        System.out.println(treeQuestion(new String[] {theme, category}).getName());
        System.out.println(treeQuestion(new String[] {theme, category}).getAbsolutePath());

        DataQuestion dataQuestion = new ObjectMapper().readValue(
                treeQuestion(new String[] {theme, category}), DataQuestion.class);



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

    /**
     * lsDirQuestion
     * @param pathDir ([]|null : theme, [theme] : cathegorie, [theme, cathegorie] : question.json
     * @return
     */
    private static File treeQuestion(String[] pathDir) throws Exception {
        if (pathDir == null) pathDir = new String[]{};
        if (pathDir.length > 2) throw new Exception("Table too big");
        String path = "questionJSON";
        if (System.getProperty("os.name").split(" ")[0].equals("Windows")){
            for (int i = 0; i < pathDir.length; ++i){
                if (i < pathDir.length) path += "\\";
                path += pathDir[i];

            }
            if (pathDir.length == 2) path += "\\questions.json";
        } else { //Linux
            for (int i = 0; i < pathDir.length; ++i){
                if (i < pathDir.length) path += "/";
                path += pathDir[i];
            }
            if (pathDir.length == 2) path += "/questions.json";
        }
        return new File(path);
    }

    private static ArrayList<String> lsDir (File disParent){
        ArrayList<String> listDir = new ArrayList();
        for (File dirChild: disParent.listFiles()){
            if(dirChild.isDirectory()) listDir.add(dirChild.getName());
        }
        return listDir;
    }

    public static void main(String[] args) throws Exception {
        Question q = new Question();
        System.out.println("theme : "+ q.theme);
        System.out.println("category : "+ q.category);
    }
}
