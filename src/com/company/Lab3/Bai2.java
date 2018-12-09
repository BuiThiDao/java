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
public class Bai2 {

    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j + "\t");
            }
            System.out.println("");
        }
    }
}
