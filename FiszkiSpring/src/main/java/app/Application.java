package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import interfaces.ListaFiszek;
import model.Config;
import model.FiszkaManagerEng;
import model.Translator;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ListaFiszek fm = (ListaFiszek) context.getBean(FiszkaManagerEng.class);
        fm.getListaFiszek();
        fm.dodajFiszke("komputer", "computer");
        System.out.println("__________________");
        fm.getListaFiszek();

        Translator translator = context.getBean(Translator.class);
        translator.getEng().dodajFiszke("lampa", "lamp");
        translator.getEng().getListaFiszek();

        translator.getDe().dodajFiszke("mama", "Die Mutter");
        translator.getDe().getListaFiszek();


    }
}
