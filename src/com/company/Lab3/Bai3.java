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
public class Bai3 {

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap tung phan tu mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println(" " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang la: ");
        show(arr);

        //Sap xep mang:
        int tam = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j] > arr[i]) {
                    tam = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tam;
                }
            }
        }
        System.out.println("sap xep tang dan");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu " + i + " la :" + arr[i]);
        }

        //Tim so nho nhat
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
            System.out.println("So nho nhat: " + min);
            break;
        }

        //Trung binh cong cac so chia het cho 3
        int dem = 0;
        int s = 0;
        
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0) {
                    s += arr[i];
                    dem++;
                }   
        }
        float kp = s/dem;
        System.out.println("Trung bình cong chia het cho 3: " +kp);
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
