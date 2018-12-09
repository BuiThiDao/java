/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.Lab1;

import java.lang.annotation.Annotation;
import java.util.Scanner;

/**
 *
 * @author Dao NGo
 */
public class Bai3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Canh cua hinh lap phuong: ");
        Float canh = scanner.nextFloat();
        Float V;
        V = canh*canh*canh;
        System.out.println("The tich cua hinh lap phuong: " +V);
    }
    
}
