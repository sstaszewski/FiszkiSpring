package model;

public class Fiszka {
    private String wordPL;
    private String wordEng;

    public Fiszka(String wordPL, String wordEng) {
        this.wordPL = wordPL;
        this.wordEng = wordEng;
    }
    public String dane(){
        return wordPL + " = " + wordEng;
    }

    public String getWordPL() {
        return wordPL;
    }

    public String getWordEng() {
        return wordEng;
    }
}
