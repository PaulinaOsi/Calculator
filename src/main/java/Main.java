public class Main {

    public static void main(String [] args){

        Calculator myCalc = new Calculator(1,2);
        int result = myCalc.getNum1() + myCalc.getNum2();

        System.out.println("Result: " +result);
    }

}


