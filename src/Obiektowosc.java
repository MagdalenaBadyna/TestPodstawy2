public class Obiektowosc {
    public static void main(String [] args){

        Human czlowiek1 = new Human ( "Kasia", "Nowakowska", 1991);
        czlowiek1.przedstawSie();
        //Metoda przedstawSie jest dostepna, bo jest public
        czlowiek1.przedstawSie();

        //Atrybut name oraz funkcja oblicz wiek nie sa dostepne poza klasa Human
        //Bo sa private
        //czlowiek1.name;
        //czlowiek1.obliczWiek();

        Human czlowiek2 = new Human( "Robert","Kowalski",1985);
        czlowiek2.przedstawSie();

        Human czlowiek3 = new Human("Andrzej", "Szybki", 1980);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek3.getName() + "" + czlowiek3.getSurname());
        czlowiek3.setBirthyear(1975);
        czlowiek3.przedstawSie();

        //2 obiekty klasy Car
        Car Opel = new Car ( "Opel", "Astra", 2006);
        Opel.przyspiesz (60);
        Opel.przyspiesz(20);
        Opel.opiszAuto();

        Car BMW = new Car ("BMW", "m3", 2016);
        BMW.przyspiesz(152);
        BMW.opiszAuto();


    }
}
