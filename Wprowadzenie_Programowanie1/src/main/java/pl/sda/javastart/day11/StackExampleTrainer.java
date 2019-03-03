package pl.sda.javastart.day11;

import sun.invoke.empty.Empty;

import java.util.EmptyStackException;

public class StackExampleTrainer<T> { //  to trener napisał to samo co ja w StackExample trzeba w domu skonfrontować
    private int size = 20;
    private Object[] container = new Object[size];
    private int index = -1;

    public void push(T t){
        if(t==null){
            throw new RuntimeException();
        }
        index++;
        if(index == container.length -1){
            Object[] workContainer = new Object[container.length+size];
            for (int i = 0; i < container.length; i++) {
                workContainer[i]=container[i];
            }
            container=workContainer;
        }
        container[index]= t;
    }

    public T pop(){
        if(index ==-1){
            throw new EmptyStackException();
        }
        return (T) container[index--]; // bez tego (T) będzie wołał że zły zapis, bo nie wie co to za typ a ten zapis to rzutowanie
    }

    public boolean isEmpty(){
        return index == -1;
    }

    public T peek(){
        if(index ==-1){
            throw new EmptyStackException();
        }
        return (T)container[index];
    }
}
