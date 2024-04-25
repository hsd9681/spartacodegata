package week5;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private Abstract operation;

    public Calculator(Abstract operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(Abstract operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}