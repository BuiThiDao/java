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
public class Bai3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So dien: ");
        Float sodien = scanner.nextFloat();
        Float tien1, tien2;
        tien1 = sodien *1000;
        tien2 = 50 *1000 + (sodien - 50)*1200;
        if(sodien < 50)
        {
            System.out.println("So tien phai tra: " + tien1);
        }
        else{
            System.out.println("So tien phai tra: " + tien2);
        }
    }
}
