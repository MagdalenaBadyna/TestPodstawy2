import com.sun.source.tree.WhileLoopTree;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static String zwrocImie(){
        Integer casel = 5;
        String imie = "";
        switch (casel){
            case 1: imie = "Magda"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
            default: imie = "No name";
        }
        return imie;
    }

    public static void przedstawSie(String imie) {
        System.out.println("Moje imie to" + imie);
    }
    // Wpisujemy main
    //Funkcja egzekucyjna

    public static void main(String[] args) {
        String imie = zwrocImie();
        przedstawSie(imie);

        System.out.println("hej, hello");
        String Imie = "magdalena";
        Boolean isMagda = imie.contains("magda");
        System.out.print(isMagda);
        //Integer - typ numeryczny liczb całkowitych
        //Long - liczba całkowita, dużo dłuższy
        Integer liczba1 = 2;
        Long liczba2 = Long.valueOf(1302);
        liczba1.equals(liczba2);
        //Typ prosty, Integer to klasa wrappujaca typ prosty int (daje metody
        //ulatwiajace prace z danym typem

        //Float - typ numeryczny zmiennoprzecinkowy
        //Float ulamek1 = 10.155;
        Double ulamek2 = 10.5;

        //Kolekcje
        //Lista = zbior elementow v indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(imie);
        lista1.add("isMagda");
        System.out.print(lista1.toString());

        //HasMap - slovnik trzymajacy pary klucz-vartosc
        HashMap<String, Integer> mapal = new HashMap<>();
        mapal.put(imie, liczba1);
        mapal.put("isMagda", 5);
        System.out.print(mapal.toString());
        //Pair - slovnik tylko jedna pare klucz vartosc
        Pair<String, Integer> pair = new Pair<>(imie, 1);
        String napis2 = pair.getKey();
        napis2 += pair.getValue().toString();
        System.out.print(napis2);
        //CTRL + SHIFT + F10 - odpalenie aktualnej konfiguracji

        //Pętle
        //Pętle for
        //Warunek poczatkowy (wartosc poczatkowa licznika);
        // warunek koncowy (wartosc koncowa licznika);
        // modyfikator licznika 1++ oznacza, że i bedzie wieksze o 1 po petli
        for (Integer i = 0; i <= 5; i++) {
            System.out.print("wartosc licznika: " + i.toString());
        }
        Integer i = 0;
        while (i < 5) {
            System.out.print("Jestem w while po raz" + i.toString());
            i++;
        }

        //break to specjalne slovo, ktore pozvala zakonczyc dzialanie petli"
        while (true) {
            i++;
            if (i.equals(7))
                continue;
            System.out.print(" " + i.toString());
            if (i.equals(10))
                break;
        }
        //Pętla do while - zawsze wykona sie chociaż jedna interacja
        do {
            System.out.println("Jestem w do while");
            i++;
        } while (i < 10);

        //Pętla for each
        for (String el : lista1) {
            System.out.println("Element listy: " + el);
        }

        //Pętla for each na mapie #TODO
        //for (String el: mapa1) {}

        //Instrukcje warunkowe
        //Instrukcjie if..else if..else

        if (lista1.size() == 2) {
            System.out.println("Hej, jestem w instrukcji warunkowej");
        }
        if (lista1.size() < 1) {
            System.out.println("z tym warunkiem nigdy sie nie wypisze");
        } else {
            System.out.println("Jestem w instrukcji elese");
        }

        if (lista1.size() < 1) {
            System.out.println("Nie wykonam sie");
        } else if (lista1.size() == 2) {
            System.out.println("Ja sie wykonam");
        } else {
            System.out.println("Ja sie juz nie wykonam, bo warunek jest spelniony");
        }
        //Instrukcja warunkowa svitch case - na koncu każdego

        i = 2;
        String message = "Moje imie to ";
        switch (i) {
            case 2:
                message += "Magda";
                break;
            case 5:
                message += "Tomek";
                break;
            case 8:
                message += "Dawid";
                break;
        }
        System.out.println(message);
    }
}


