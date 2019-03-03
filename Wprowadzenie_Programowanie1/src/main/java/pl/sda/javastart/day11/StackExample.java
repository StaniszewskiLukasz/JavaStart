package pl.sda.javastart.day11;

public class StackExample<T> { // to ja napisałem tą klasę i jej metody
    private int index = 0; // tu błąd tu musi być minus 1, gdyby tu było 0 musielibyśmy zrobić inną logikę inkrementacji dla 0 i inną dla liczb wyższych
    private int size = 10;
    private Object[] stack1 = new Object[size];

    public static void main(String[] args) {



    }

    public void pushToStack(int value) {
        if (index >= size) {
            System.out.println("Stos jest pełen");
        } else {
            stack1[index] = value;
            index++;
        }
    }

    public Object popFromStack() {
        if (index < 0) {
            System.out.println("Stos jest pusty");
        }else if(stack1[index]==null){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            Object value = stack1[index];
            index--;
            return value;
        }
        return 0;
    }

    public int peekStack() {
        int value=0;
        if (index < 1) {
            System.out.println("Stos jest pusty");
        }else{
            value = index;
            index--;
        }
       return value;
    }

    public boolean isEmptyStack() {
        return stack1 == null || stack1.length == 0 ? true : false;
    }

}
