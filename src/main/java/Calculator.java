public class Calculator {
    private String name;
    private double num1;
    private double num2;

    public Calculator(String name, double num1, double num2) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getName(){
        return this.name;
    }

    public double getNum1(){
        return this.num1;
    }

    public double getNum2(){
        return this.num2;
    }

    public double Add(){
        return num1 + num2;
    }

    public double Subtract(){
        return num1 - num2;
    }

    public double Multiply(){
        return num1 * num2;
    }

    public double Divide(){
        return num1 / num2;
    }
}


