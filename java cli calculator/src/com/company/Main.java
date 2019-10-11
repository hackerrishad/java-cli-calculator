package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("            ==============================\n");
        System.out.print("            =     JAVA CLI CALCULATOR    =\n");
        System.out.print("            ==============================\n");
        Scanner Scan = new Scanner(System.in);
        System.out.print("enter your fast number : ");
        int input1 = Scan.nextInt();
        System.out.print("Enter You second number : ");
        int input2 = Scan.nextInt();
        System.out.print("============================\n");
        System.out.print("1: Addition,\n");
        System.out.print("2: Subtraction,\n");
        System.out.print("3: Multiplication,\n");
        System.out.print("4: Division,\n");
        System.out.print("============================\n");
        System.out.print("# What operation would you like to perform : ");
        int input3 = Scan.nextInt();
        if(input3==1){
            System.out.print("result : ");
            System.out.print(input1 + input2);
        }
        if(input3==2) {
            System.out.print("result : ");
            System.out.print(input1 - input2);
        }
        if(input3==3) {
            System.out.print("result : ");
            System.out.print(input1 * input2);
        }
        if(input3==4) {
            System.out.print("result : ");
            System.out.print(input1 / input2);
        }
        System.out.println();
        System.out.print("                =====================================\n");
        System.out.print("                                Tnx For use my Script\n");
        System.out.print("                =====================================\n");

    }
}
