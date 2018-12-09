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
public class Bai1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n :");
        n = sc.nextInt();
        boolean flag = true;
        for ( int i = 2 ; i <= n -1 ; i ++){
            if ( n % i == 0){
                flag = false;
                break;
            }
        }
        if ( flag == true){
            System.out.println(n + " la so nguyen to");
            
        } else {
            System.out.println(n + " khong la so nguyen to");
        }
    }
    
    }