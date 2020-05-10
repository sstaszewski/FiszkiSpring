package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import interfaces.ListaFiszek;


@Component
@Qualifier("eng")
public class FiszkaManagerEng implements ListaFiszek {

    List<Fiszka> listaFiszek;

    public FiszkaManagerEng() {
        super();
        this.listaFiszek = new ArrayList<Fiszka>();
        this.listaFiszek.add(new Fiszka("kot","cat"));
        this.listaFiszek.add(new Fiszka("pies", "dog"));
    }

    public FiszkaManagerEng(Fiszka fiszka) {
        super();
        this.listaFiszek = new ArrayList<Fiszka>();
        this.listaFiszek.add(fiszka);
    }

    @Override
    public void getListaFiszek() {
        for (Fiszka f : listaFiszek) {
            System.out.println(f.dane());
        }
    }

    @Override
    public void dodajFiszke(String wordPL, String wordEng) {
        listaFiszek.add(new Fiszka(wordPL, wordEng));
    }

    @Override
    public void usunFiszke(int id) {
        listaFiszek.remove(id);
    }

}
