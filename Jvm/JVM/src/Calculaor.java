import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculaor {


    public void main(String[] args) {
        if(args.length<3){

        }
        String typeofOperation = args[0];
        String firrstOperation = args[1];
        String secondOperation = args[2];


        System.out.println(typeofOperation + " " + firrstOperation + " " + secondOperation);
        int first = Integer.valueOf(firrstOperation);
        int second = Integer.valueOf(secondOperation);

        if (typeofOperation.equals("dodaj")) {
            int sum = first + second;
            System.out.println(sum);
        } else if (typeofOperation.equals("odejmij")) {
            int sum = first - second;
            System.out.println(sum);
        } else if (typeofOperation.equals("pomnóź")) {
            int sum = first * second;
            System.out.println(sum);
        }
        try{
            Class c = this.getClass();
            Method action = c.getMethod(typeofOperation, int.class,int.class);
            Object result = action.invoke(this, first ,second);
            System.out.println("Wynik to:" + result);
        }catch (NoSuchMethodException|IllegalAccessException| InvocationTargetException e){
            System.out.println("Brak metody");

        }
    }
}
