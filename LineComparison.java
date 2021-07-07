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

        double length_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.printf("Length of end point is : %.2f %n", length_of_line);
    }
}
