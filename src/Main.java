import java.util.function.*;

public class Main {
    public static void main (String[]args){
     Calculator calk = new Calculator();

     int a = calk.plus.apply(1,2);
     int b = calk.minus.apply(1, 1);
     int c = calk.devide.apply(a, b);

     calk.println.accept(c);

//Ошибка возникает из-за деления на 0, т.к. отсутсвует проверка. В методе devide можно сделать проверку на ноль.
    }
}
