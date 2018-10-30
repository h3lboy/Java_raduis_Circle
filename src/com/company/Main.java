

package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        double a = 4;
        double b = 3.14;
        double r;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the reduis");

        r = scanner.nextDouble();

        double q = surface_area(a,b,r);

        System.out.println("The Result is  " + q);



    }


    static double surface_area(double a , double b, double r){


       double c =  a * b * r * r;

       return c;

    }




     }

