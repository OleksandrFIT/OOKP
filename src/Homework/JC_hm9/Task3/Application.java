package Homework.JC_hm9.Task3;

public class Application {
    public static void main(String[] args) throws IllegalAccessException, MyException {

        Methods methods = new Methods(65.8, -34);

        if ((methods.getFirstNum() < 0) && (methods.getSecondNum() < 0) ){
            throw new IllegalArgumentException("a or b is less than 0");
        } else if (((methods.getFirstNum() == 0) && (methods.getSecondNum() != 0)) || (methods.getSecondNum() == 0) && (methods.getFirstNum() != 0)){
            throw new ArithmeticException("(a=0 і b!=0) or (b=0 і a!=0)");
        } else if(methods.getFirstNum() == 0 && methods.getSecondNum() == 0){
            throw new IllegalAccessException("a = 0 and b equals zero");
        } else if(methods.getFirstNum() > 0 && methods.getSecondNum() > 0){
            throw new MyException("a and b are grater than zero");
        }

        methods.plusNums();
        methods.minusNums();
        methods.multiplyNums();
        methods.devideNums();


    }
}
