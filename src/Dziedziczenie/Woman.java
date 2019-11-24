package Dziedziczenie;

import obiektowosc.Human;

public class Woman extends Human{

    private String plec;

    public Woman (String name, String surname, Integer birthyear){
        super (name, surname,birthyear);
        this.plec = "kobieta";
    }
    //Nadpisywanie metod
    @Override
    public void przedstawSie(){
        super.przedstawSie();
        System.out.println("Jestem" + this.plec);
    }
}
