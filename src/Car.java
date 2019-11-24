public class Car {

    private String marka;
    private String model;
    private Integer rokProdukcji;
    private Integer age;
    private Integer predkosc;

    Car(String marka, String modela, Integer rokProdukcji){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.age = obliczWiek();
        this.predkosc = 0;
    }
    private Integer obliczWiek() {
        Integer actualYer = 2019;
        return actualYer - this.rokProdukcji;
    }
    public Integer przyspiesz(Integer zmiana){
        this.predkosc += zmiana;
        System.out.println("Twoja predkosc to: " + this.predkosc);
        return this.predkosc;
    }

    public void opiszAuto(){
        System.out.println("Oto " + this.marka + "" + this.model);
        if (this.age <5) {
            System.out.println("Nowe auto prawie nie używane");
        }else if ( this.age <= 20){
            System.out.println("Troche ju:z jezdzi, ale jeszcze dziala");
        }else {
            System.out.println("Nadaje sie tylko na zlom");
        }
    }
}
