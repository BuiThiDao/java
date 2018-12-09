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
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap a: ");
        Float a = scanner.nextFloat();
        System.out.println("Moi nhap b: ");
        Float b = scanner.nextFloat();
        Float x;
        x = -b/a;
        if(a==0)
        {
            if(b==0)
            {
                System.out.println("Phuong trinh vo so nghiem");
            }
            if(b != 0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        else
        {
            System.out.println("Phuong trinh co nghiem: " + x);
        }
        
    }
}
