package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import interfaces.ListaFiszek;

@Component
public class Translator {

    @Autowired
    @Qualifier("eng")
    private ListaFiszek eng;

    @Autowired
    @Qualifier("de")
    private ListaFiszek de;

//    @Autowired
//    public Translator(ListaFiszek eng, ListaFiszek de) {
//        this.eng = eng;
//        this.de = de;
//    }

    public ListaFiszek getEng() {
        return eng;
    }

    public void setEng(ListaFiszek eng) {
        this.eng = eng;
    }

    public ListaFiszek getDe() {
        return de;
    }

    public void setDe(ListaFiszek de) {
        this.de = de;
    }
}
