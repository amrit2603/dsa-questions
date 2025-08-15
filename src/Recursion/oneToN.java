package Recursion;

import java.util.Scanner;

public class oneToN {

    void method(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        method(n-1); //123..n-1
    }

    public static void main(String[] args) {
        //create a method to print from 1 to N
        Scanner scan = new Scanner(System.in);
        System.out.print("input a number: ");
        int n = scan.nextInt();

        oneToN obj = new oneToN();
        obj.method(n); // 1234567..n

        //this is my feature change
    }
}

