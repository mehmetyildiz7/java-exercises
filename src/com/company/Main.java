package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("hello world");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double radius = input.nextDouble();

        double area = radius*radius*3.14159;

        System.out.println("Area is : "+area);


    }
}
