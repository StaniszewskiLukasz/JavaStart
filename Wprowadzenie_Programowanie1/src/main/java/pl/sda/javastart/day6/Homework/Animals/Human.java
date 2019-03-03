package pl.sda.javastart.day6.Homework.Animals;

public class Human extends Mammal implements OwnerHolder {

    public void cogitoErgoSum(){
        System.out.println("Jestem więc powinienem myśleć.");
    }


    @Override
    public String introduceYourself() {
        return "Jestem człowiekiem choć czasem zachowuje się jak zwykła małpa";
    }

    public Human(String name, Double weight, Integer age) {
        super(name, weight, age);
    }

    @Override
    public String getOwnerName() {
        return getName() ;
        }
    }

