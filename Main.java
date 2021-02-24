package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Imput a number 1");
        int x = in.nextInt();
        System.out.println("Imput a number 2");
        int a = in.nextInt();
        System.out.println("Imput a number 3");
        int b = in.nextInt();
        System.out.println("Imput a number 4");
        int c = in.nextInt();
         if (x<0 &&  b!=0)
         {
             double fx = a * Math.pow(x,2) + b;
         }
             else if (x>0 && b==0)
         {
             double fx = (x - a) / (x - c);
         }
             else
         {
             System.out.println(x);
         }in.close();
    }
}
