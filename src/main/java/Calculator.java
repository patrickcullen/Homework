public class Calculator {
    private String name;
    private int num1;
    private int num2;

    public Calculator(String name, int num1, int num2) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getName(){
        return this.name;
    }

    public int getNum1(){
        return this.num1;
    }

    public int getNum2(){
        return this.num2;
    }
}


