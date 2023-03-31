//Create a function which takes an integer n from the user and give the sum of 1 to n.

import java.util.Scanner;

class Summation{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n){
            sum += i;
            i += 1;
        }
        System.out.println("--> Summation of 1 to n: " + sum);
    }
}