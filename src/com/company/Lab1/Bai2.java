/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.Lab1;

import java.util.Scanner;

/**
 *
 * @author Dao NGo
 */
public class Bai2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai hinh chu nhat: ");
        Float chieudai = scanner.nextFloat();
        System.out.println("Chieu rong hinh chu nhat: ");
        Float chieurong = scanner.nextFloat();
        Float chuvi , dientich, canhmin;
        chuvi = (chieudai + chieurong) *2;
        dientich = chieudai * chieurong;
        canhmin = Math.min(chieudai, chieurong);
        
        System.out.println(" Chu vi cua hinh chu nhat: " + chuvi);
        System.out.println("Dien tich cua hinh chu nhat: " + dientich);
        System.out.println("Canh nho nhat: " + canhmin);
    }
    
}
