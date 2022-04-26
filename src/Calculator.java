public class Calculator {

    private double number1;
    private double number2;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void CalculatorAdd(){
        System.out.println(number1 + number2);
    }

    public void CalculatorSubtract(){
        System.out.println(number1 - number2);
    }

    public void CalculatorMultiply(){
        System.out.println(number1 * number2);
    }

    public void CalculatorDivide(){
        System.out.println(number1 / number2);
    }
}
