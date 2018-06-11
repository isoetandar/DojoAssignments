class Calculator implements java.io.Serializable {
    private String operator;
    private double number1;
    private double number2;
    public Calculator(){
    }
    public Calculator(char operator, double number1, double number2){
        this.operator = operator;
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setOperator(char operator){
        this.operator = operator;
    }

    public void setNumber1(double number){
        this.number1 = number;
    }
    public void setNumber2(double number){
        this.number2 = number;
    }
}