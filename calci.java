import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What Do you want to Perform : Add , Subtract , Multiply , Divide ? ");
        String ans = input.next();

        System.out.print("Enter the First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = input.nextInt();

        int add = add(num1, num2);
        int subtract = subtract(num1, num2);
        int multiply = multiply(num1, num2);
        int divide = divide(num1, num2);
        if (ans.equals("Add")) {
            System.out.println("The Addition of the given two Number is : "+ add);
        }
        else if (ans.equals("Subtract")) {
            System.out.println("The Subtraction of the given two Number is : "+ subtract);
        }
        else if(ans.equals("Multiply")) {
            System.out.println("The Multiplication of the given two Number is : "+ multiply);
        }
        else if (ans.equals("Divide")) {
            System.out.println("The Division of the given two Number is : "+ divide);

        }
        else {
            System.out.println("Please enter a Valid Operation Name");
        }
        input.close();
    }



    public static int add(int num1 , int num2){
        int sum = num1+num2;
        return sum ;
    }

    public static int subtract(int num1 , int num2){
        int diff = num1-num2;
        return diff ;
    }

    public static int multiply(int num1 , int num2){
        int multiply = num1*num2;
        return multiply ;
    }

    public static int divide(int num1 , int num2){
        int div = num1/num2;
        return div ;
    }
}