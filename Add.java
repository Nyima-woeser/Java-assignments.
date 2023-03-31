import java.util.Scanner;

class Add{
    static int add(int n1, int n2){
    return n1 + n2;
    }
    public static void main(String[] arg){
        System.out.println("Addition of two integers using a function/method:-");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of the two given integers is: " + add(num1, num2));
    }
}
