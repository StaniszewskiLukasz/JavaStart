package pl.sda.javastart.day4.Homework;

import java.util.Arrays;

public class TrainExercise21 {
    private String name;
    private int weight;
    private int numberOfPassanger;
    private int numberOfVans;
    private VanExercise23[] vans;


   /* public void addOneVan(VanExercise23 van) {
        for (int i = 0; i < ; i++) {

        }
    }*/


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumberOfPassanger() {
        return numberOfPassanger;
    }

    public int getNumberOfVans() {
        return numberOfVans;
    }

    public VanExercise23[] getVans() {
        return vans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumberOfPassanger(int numberOfPassanger) {
        this.numberOfPassanger = numberOfPassanger;
    }

    public void setNumberOfVans(int numberOfVans) {
        this.numberOfVans = numberOfVans;
    }

    public void setOptions(VanExercise23[] vans) {
        this.vans = vans;
    }

    @Override
    public String toString() {
        return "TrainExercise21{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", numberOfPassanger=" + numberOfPassanger +
                ", numberOfVans=" + numberOfVans +
                ", options=" + Arrays.toString(vans) +
                '}';
    }
}
