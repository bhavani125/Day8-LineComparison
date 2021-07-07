package com.line;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison problem");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x co-ordinate of first point: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y co-ordinate of first point: ");
        int y1 = sc.nextInt();
        System.out.println("Enter x co-ordinate of second point: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y co-ordinate of second point: ");
        int y2 = sc.nextInt();

        System.out.println("Enter x co-ordinate of third point: ");
        int p1 = sc.nextInt();
        System.out.println("Enter y co-ordinate of third point: ");
        int q1 = sc.nextInt();
        System.out.println("Enter x co-ordinate of forth point: ");
        int p2 = sc.nextInt();
        System.out.println("Enter y co-ordinate of forth point: ");
        int q2 = sc.nextInt();

        Double length_of_line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Double length_of_line2 = Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));

        System.out.printf("length of 1st end points are : %.2f %n", length_of_line1);
        System.out.printf("length of 2nd end points are : %.2f %n", length_of_line2);
        int res = length_of_line1.compareTo(length_of_line2);
        if(res > 0)
            System.out.println("Length of first end points is greater than length of second end points");
        else if(res < 0)
            System.out.println("Length of first end points is less than length of second end points");
        else
            System.out.println("Both lines are equal.");
    }
}
