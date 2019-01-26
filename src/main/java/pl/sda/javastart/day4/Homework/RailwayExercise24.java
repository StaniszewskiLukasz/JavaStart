package pl.sda.javastart.day4.Homework;

public class RailwayExercise24 {
    public static void main(String[] args) {

        TrainExercise21 firstTrain = new TrainExercise21();
        firstTrain.setName("Kościuszko");
        firstTrain.setWeight(42);
        firstTrain.setNumberOfVans(15);
        firstTrain.setNumberOfPassanger(450);

        VanExercise23 carriage = new VanExercise23();
        carriage.setVanClass("Second Class");
        carriage.setWeight(30);
        carriage.setNumbersOfPassangers(100);
        carriage.setMeals(true);

        VanExercise23 freighter = new VanExercise23();
        freighter.setVanClass("Boxcar");
        freighter.setWeight(45);
        freighter.setNumbersOfPassangers(0);
        freighter.setMeals(false);

        VanExercise23 sleeper = new VanExercise23();
        sleeper.setVanClass("First Class");
        sleeper.setWeight(25);
        sleeper.setNumbersOfPassangers(50);
        sleeper.setMeals(true);

        VanExercise23[] vans = new VanExercise23[]{carriage, freighter, sleeper};
        firstTrain.setOptions(vans);

        System.out.println(firstTrain);

    }
}
