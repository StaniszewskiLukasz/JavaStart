package pl.sda.javastart.day10;

public class Stack {

    private int top = -1;
    private int size = 100;
    private Object[] stackArr = new Object[size];

    public static void main(String[] args) {

    }

    public boolean isEmpty() {
        return stackArr == null || stackArr.length == 0 ? true : false;
    }

    public boolean push(Object o){
       if(top>=(size-1)){ // lub tylko > i wtedy bez - przy 1
           System.out.println("Stack is full");
           return false;
       }
       stackArr[++top] = o;
        System.out.println((o +"push into stack"));
        return true;
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println(stackArr[top]);
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public Object pop(){
        if(top>0){
            Object x = stackArr[top--];
            return x;
        }else{
            System.out.println("Stack jest pusty");
            return 0;
        }
    }

}
