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
public class Bai1 {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap ho ten: ");
        String hoten = scanner.nextLine();
        System.out.println("Diem TB: ");
        Float diemtb = scanner.nextFloat();
        System.out.println(" Ho ten: " +hoten);
        System.out.println("Diem trung binhf: " + diemtb);
    }
    
}
