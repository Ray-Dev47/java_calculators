import java.util.Scanner;

class calculator_1{

    public static void main(String[] args) {
        char operator;
        double num1, num2 , answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to java calculator, pls enter either +, -, /, or * operators");
        operator = sc.next().charAt(0);

        System.out.println("Enter first num");
        num1 = sc.nextDouble();

        System.out.println("Enter second number");
        num2 = sc.nextDouble();

        // logic with if conditions
        // if(operator == '/'){
        //     answer = num1 +  num2;
        //     System.out.println(num1 + " plus " + num2 + " gives " + answer);
        // }
        // else if(operator == '*'){
        //     answer = num1 * num2;
        //     System.out.println(num1 + " multiplied by " + num2 + " gives " + answer);
        // }
        // else if(operator == '-'){
        //     answer = num1 - num2;
        //     System.out.println(num1 + " subtracted from " + num2 + " gives " + answer);
        // }
        // else if(operator == '/'){
        //     answer = num1 / num2;
        //     System.out.println(num1 + " divided by " + num2 + " gives " + answer);
        // }
        // else{
        //     System.out.println("Invalid input");
        // }

        // using switch statement
        switch (operator) {
            case '/':
                answer = num1 / num2;
                System.out.println(num1 + " divided by " + num2 + " gives " + answer); 
                break;
            case '+':
                answer = num1 + num2;
                System.out.println(num1 + " plus " + num2 + " gives " + answer); 
                break;
            case '*':
                answer = num1 * num2;
                System.out.println(num1 + " multiplied by " + num2 + " gives " + answer); 
                break;
            case '-':
                answer = num1 - num2;
                System.out.println(num1 + " subtracted from " + num2 + " gives " + answer); 
                break;
            
            default:
            System.out.println("Invalid operator!");
                break;
        }
        sc.close();
    }
}