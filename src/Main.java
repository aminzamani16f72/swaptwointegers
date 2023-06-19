import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi There!");
        System.out.println("please enter two integers");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int tmp;
        tmp=num1;
        num1=num2;
        num2=tmp;
        System.out.println("num1= "+num1+"  "+"num2= "+ num2);
    }
}