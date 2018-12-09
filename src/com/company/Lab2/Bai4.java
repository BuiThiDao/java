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
public class Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------");
        System.out.println("1. Giai phuong trinh bac nhat");
        System.out.println("2. Giai phuong trinh bac 2");
        System.out.println("3.Tinh tien dien nuoc: ");
        System.out.println("4. Thoat");
        System.out.println("Moi ban chon chuc nang");
        int luachon = scanner.nextInt();
        switch (luachon) {
            case 1: {
                System.out.println("Moi nhap a: ");
                Float a = scanner.nextFloat();
                System.out.println("Moi nhap b: ");
                Float b = scanner.nextFloat();
                Float x;
                x = -b / a;
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("Phuong trinh vo so nghiem");
                    }
                    if (b != 0) {
                        System.out.println("Phuong trinh vo nghiem");
                    }
                } else {
                    System.out.println("Phuong trinh co nghiem: " + x);
                }
                break;

            }
            case 2: {
                System.out.println(" Moi nhap a: ");
                Double a = scanner.nextDouble();
                System.out.println("Moi nhap b: ");
                Double b = scanner.nextDouble();
                System.out.println("Moi nhap c: ");
                Double c = scanner.nextDouble();
                Double delta, x, x1, x2;
                delta = b * b - 4 * a * c;
                x = -b / (2 * a);
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
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
                    if (delta == 0) {
                        System.out.println("Phuong trinh co nghiem kep: " + x);
                    }
                    if (delta < 0) {
                        System.out.println(" Phuong trinh vo nghiem");
                    }
                    if (delta > 0) {
                        System.out.println("Phuong trinh co 2 nghiem phan biet: " + x1 + x2);
                    }
                }
                break;
                
            }

            case 3: {
                System.out.println("So dien: ");
                Float sodien = scanner.nextFloat();
                Float tien1, tien2;
                tien1 = sodien * 1000;
                tien2 = 50 * 1000 + (sodien - 50) * 1200;
                if (sodien < 50) {
                    System.out.println("So tien phai tra: " + tien1);
                } else {
                    System.out.println("So tien phai tra: " + tien2);
                }
                break;
            }
            case 4:
            {
                System.out.println("Ban da thoat khoi lua chon");
            }
        }
    }
}
