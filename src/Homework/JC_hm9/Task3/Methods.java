package Homework.JC_hm9.Task3;

public class Methods {

    private double firstNum;
    private double secondNum;

    public Methods(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }


    public void multiplyNums(){
        System.out.println(firstNum * secondNum);
    }
    public void devideNums(){
        System.out.println(firstNum / secondNum);
    }
    public void plusNums(){
        System.out.println(firstNum + secondNum);
    }
    public void minusNums(){
        System.out.println(firstNum - secondNum);
    }


    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }
}
