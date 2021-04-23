package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, dig, rev = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        while(n!=0){
            dig = n%10;
            n = n/10;
            rev = rev * 10 + dig;
        }
        System.out.println("Reverse of a number : " +rev);
    }
}
