//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;
        boolean validOperation=true;

        System.out.println("Enter the first number : ");
        num1=sc.nextDouble();

        System.out.println("Enter an operator (+,-,*,/,^ : ");
        operator=sc.next().charAt(0);

        System.out.println("Enter the Second number : ");
        num2=sc.nextDouble();

        switch(operator){
            case'+'-> result = num1+num2;
            case'-'-> result = num1-num2;
            case'*'-> result = num1*num2;
            case'/'-> {
                if (num2==0){
                    System.out.println("Cannot divided by zero!");
                    validOperation=false;
                }
                else{
                    result =num1/num2;
                }
            }

            case'^'-> result = Math.pow(num1,num2);
            default ->{
                System.out.println("Invalid operator");
                validOperation=false;
            }

        }
        if (validOperation){
            System.out.println(result);

        }

        sc.close();

    }
}