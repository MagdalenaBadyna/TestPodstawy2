public class Human {
    private String name;
    private String surname;
    private Integer birthyear;
    private Integer age;

    //Konstruktor
    Human(String name, String surname, Integer birthyear) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.age = this.obliczWiek();
    }

    //metody klasy
    private Integer obliczWiek(){
        Integer actualYer = 2019;
        return actualYer - this.birthyear;

    }

    public void przedstawSie(){
        System.out.println("Hej, Nazywam sie" + this.name + "" + this.surname);
        System.out.println("Mam" + this.age + "lat");
    }

    //Metody settery i gettery
    //Getter
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    //Setter
    public void setBirthyear (Integer birthyear){
        this.birthyear = birthyear;
    }
}
