package pl.sda.javastart.day11;

import java.util.ArrayList;
import java.util.List;

abstract class CustomList<SomethingType> {

    private Object[] handler = new Object[10];
    private int index = 0;
    private final int pool = 1;

    public int add(SomethingType name1) {
        handler[index] = name1;
        int p = index++;
        if (handler.length - 1 < index) {
            Object[] cosutomHandler = new Object[handler.length + pool];
            for (int i = 0; i < handler.length; i++) {
                cosutomHandler[i] = handler[i];
            }
            handler = cosutomHandler;
        }

        return p;
    }

    public SomethingType get(int p) {//to metoda get trenera moja poniżej, krótsza i z obsługa błędu
        if (p > handler.length - 1) {
            throw new RuntimeException();
        }
        return (SomethingType) handler[p];
    }

    public int getValue(int name2) { //moja metoda
        int getValue = 0;
        if (name2 > handler.length - 1) {
//            getValue = handler[name2];
        }
        return getValue;
    }


    public void clear() {
        index = 0;
        for (int i = 0; i < handler.length; i++) {// to zrobiłem najpierw ale t jest złe podejście bo musisz ją przeliterować i po znullowaniu i tak zajmuje miejsce.
            handler[index] = null;
            index++;
        }
        Object[] listFour = new Object[0];
        handler = listFour;
    }

    public void clearTrainer() {
    handler = new Object[pool];
    index = 0;
    }

    public void addAll(SomethingType name3) {

    }

    public int size() { // to moja metoda size
        return handler.length;
    }

    public int sizeTrainer() { // metoda trenera
        return index;
    }

    public int sizeTrainerNextVersion() { // metoda trenera trudniejsz i bezpieczniejsza uważa na nulle
       int size=0;
        for (int i = 0; i < handler.length; i++) {
            if(handler[i] != null){
                size++;
            }
        }
        return size;
    }

    public void removeOne(int indexToRemove) { //moja metod przesunie tylko nulla w inne miejsce
        handler[indexToRemove]=null;
        for (int i = indexToRemove; i < handler.length; i++) {
            handler[i] = handler[i + 1];

        }
    }

    public void removeOneTrainer(int indexToRemove){
        if(indexToRemove>index){
            throw new RuntimeException();
        }
        handler[indexToRemove] = null;
        Object[] tabNew = new Object[handler.length];

        int j = 0;
        for (int i = 0; i < handler.length; i++) {
            if(handler[i] !=null){
                tabNew[j] = handler[i];
                j++;
            }
        }
        index--;
        handler = tabNew;
    }



    public boolean isEmpty(){ //  to moja metoda isEmpty
        if(handler.length==0){
            return true;
        }
        return false;
    }

    public boolean isEmptyTrainer(){
        return index == 0;
    }

}
