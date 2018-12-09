/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.Lab2;

import java.util.Scanner;

/**
 *
 * @author Dao NGo
 */
public class Bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Moi nhap a: ");
        Double a = scanner.nextDouble();
        System.out.println("Moi nhap b: ");
        Double b = scanner.nextDouble();
        System.out.println("Moi nhap c: ");
        Double c = scanner.nextDouble();
        Double delta, x, x1, x2;
        delta = b * b - 4 * a * c;
        x = -b/(2*a);
        x1 = (-b + Math.sqrt(delta)) / (2 *a);
        x2 = (-b - Math.sqrt(delta)) / (2 *a);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                }
                if (c != 0) {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }

        } else {
            if(delta == 0)
            {
                System.out.println("Phuong trinh co nghiem kep: " +x);
            }
            if(delta < 0)
            {
                System.out.println(" Phuong trinh vo nghiem");
            }
            if(delta > 0)
            {
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + x1 + x2);
            }
        }
    }

}
