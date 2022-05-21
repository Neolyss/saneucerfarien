package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataQuestion {
    @JsonProperty("fournisseur")
    private String fournisseur;
    @JsonProperty("rédacteur")
    private String redacteur;
    @JsonProperty("thème")
    private String theme;
    @JsonProperty("difficulté")
    private String difficulte;
    @JsonProperty("quizz")
    Quizz QuizzObject;



    public String getFournisseur() {
        return fournisseur;
    }

    public String getRedacteur() {
        return redacteur;
    }

    public String getTheme() {
        return theme;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public Quizz getQuizz() {
        return QuizzObject;
    }

    // Setter Methods

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }

    public void setRedacteur(String réedacteur) {
        this.redacteur = redacteur;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    public void setQuizz(Quizz quizzObject) {
        this.QuizzObject = quizzObject;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Quizz {
    @JsonProperty("Fr")
    Fr FrObject;


    // Getter Methods

    public Fr getFr() {
        return FrObject;
    }

    // Setter Methods

    public void setFr(Fr frObject) {
        this.FrObject = frObject;
    }
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Fr {
    @JsonProperty("débutant")
    ArrayList<Object> debutant = new ArrayList<Object>();

    @JsonProperty("confirmé")
    ArrayList<Object> confirme = new ArrayList<Object>();

    @JsonProperty("expert")
    ArrayList<Object> expert = new ArrayList<Object>();

    public ArrayList<Object> getDebutant() {
        return debutant;
    }

    public void setDebutant(ArrayList<Object> debutant) {
        this.debutant = debutant;
    }

    public ArrayList<Object> getConfirme() {
        return confirme;
    }

    public void setConfirme(ArrayList<Object> confirme) {
        this.confirme = confirme;
    }

    public ArrayList<Object> getExpert() {
        return expert;
    }

    public void setExpert(ArrayList<Object> expert) {
        this.expert = expert;
    }
}
