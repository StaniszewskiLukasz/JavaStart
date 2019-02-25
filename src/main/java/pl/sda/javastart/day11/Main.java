package pl.sda.javastart.day11;

import pl.sda.javastart.day8.Customer;

public class Main {
    public static void main(String[] args) {
     /*   Ptak papuga = new Ptak();
        papuga.kolorDzioba();
        Pies pies = new Pies();


        CustomList<Zwierze> zwierzeCustomList = new CustomList<Zwierze>();
        int i = zwierzeCustomList.add(papuga);
        System.out.println(zwierzeCustomList.get(i));*/

//odpalenie metody ze stosem dzięki generyczności
        StackExampleTrainer<String> workContainer = new StackExampleTrainer<>();
//        String push = workContainer.push();


        StackExampleTrainer<String> c = new StackExampleTrainer<>();
        c.push("Ok");
        c.push("Ok2");
        c.push("Ok3");
        c.push("Ok4");
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
    }


}
