/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.Lab3;

import java.util.Scanner;

/**
 *
 * @author Dao NGo
 */
public class Lab4 {
    
    public static void main(String[] args) {
        System.out.println("Moi nhap so phan tu cua mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String hoten[] = new String[n];
        Double diem[] = new Double[n];
        System.out.println("Nhap từng phân tử cho mảng");
        for(int i = 0; i<n; i++){
            System.out.println(" " +i);
            hoten[i] = scanner.nextLine();
            diem[i] = scanner.nextDouble();
   
        }
        System.out.println("Mảng vừa nhập là: ");
        show(hoten);
        show1(diem);
    }
    
    public static void show(String[] hoten) {
        for (int i = 0; i < hoten.length; i++) {
            System.out.print(hoten[i] + " ");
        }
    }
    
    public static void show1(Double[] diem) {
        for (int i = 0; i < diem.length; i++) {
            System.out.print(diem[i] + " ");
        }
    }
    
    
}
