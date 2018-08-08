import java.util.*;

import java.lang.*;

import java.util.Scanner;

//fibonacci series program

class Fibonacci

{  

 public static void main(String[] args)

 {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter number of elements");

        int n=s.nextInt();

        int  a = 0, b = 1;

        System.out.println("First " + n + " terms: ");



        for (int i = 1; i <= n; ++i)

        {

            System.out.print(f + " + ");



            int sum = a + b;

            a = b;

            b = sum;

        }

    }

}