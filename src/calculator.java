public class calculator {

    private double number1;
    private double number2;

    public calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculatorAdd(){
        System.out.println(number1 + number2);
    }

    public void calculatorSubtract(){
        System.out.println(number1 - number2);
    }

    public void calculatorMultiply(){
        System.out.println(number1 * number2);
    }

    public void calculatorDivide(){
        System.out.println(number1 / number2);
    }
}
