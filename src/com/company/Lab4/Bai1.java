/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.Lab4;

import java.util.Scanner;

/**
 *
 * @author Dao NGo
 */
public class Bai1 {

    private String Tensp;
    private Double dongia;
    private Double giamgia;

    public Bai1(String Tensp, Double dongia, Double giamgia) {
        this.Tensp = Tensp;
        this.dongia = dongia;
        this.giamgia = giamgia;
    }

    private Bai1() {
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public Double getDongia() {
        return dongia;
    }

    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

    public Double getGiamgia() {
        return giamgia;
    }

    public void setGiamgia(Double giamgia) {
        this.giamgia = giamgia;
    }
    
    public double getThueNhapKhau() {
        Double ThueNK = 0.1* dongia;
        return ThueNK;
    }

    public void NhapThongTin() {
        System.out.println("Moi ban nhap thong tin");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap ten sp: ");
        Tensp = scanner.nextLine();
        System.out.println("Moi nhap don gia: ");
        dongia = scanner.nextDouble();
        System.out.println("Moi nhap giam gia: ");
        giamgia = scanner.nextDouble();

    }

    public void XuatThongTin() {
        System.out.println("Thong tin ban vua nhap la: ");
        System.out.println("Ten sp: " + Tensp);
        System.out.println("Don gia: " + dongia);
        System.out.println("giam gia: " + giamgia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public static void main(String[] args) {
        Bai1 b1 = new Bai1();
        b1.NhapThongTin();
        b1.XuatThongTin();
    }
}
