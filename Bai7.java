/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
/*Nhập mảng có n phần tử các số nguyên.
a. In ra các phần tử là số nguyên tố của mảng.
b. In ra các phần tử là số hoản hảo của mảng.
c. In ra các phần tử là số chẵn.*/
public class Bai7 {
    public void nhap(int []a){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print("a["+i+"]= ");
            a[i]=scanner.nextInt();
        }
    }
    public void xuat(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public boolean ktsnt(int a){
        if(a!=2&&ktsc(a)||a<=1) return false;//a la so chan khac 2 thi khong phai so nguyen to
        else if(a==3) return true;//a bang 3 thi la so nguyen to
        else for(int i=3;i<a/2;i++){//a la so le khac 3
            if(a%i==0) return false;
        }
        return true;
    }
    public void snt(int []a){
        for(int i=0;i<a.length;i++){
            if(ktsnt(a[i])) System.out.print(a[i]+" ");
        }
    }
    public boolean ktshh(int a){
        int kiemtra=0;//tao bien de kiem tra so hoan hao
        for(int i=1;i<=a/2;i++){
            if(a%i==0) kiemtra+=i;
        }
        if(kiemtra==a) return true;
        else return false;
    }
    public void shh(int []a){
        for(int i=0;i<a.length;i++){
            if(ktshh(a[i])) System.out.print(a[i]+" ");
        }
    }
    public boolean ktsc(int a){
        if(a%2==0) return true;
        else return false;
    }
    public void sc(int []a){
        for(int i=0;i<a.length;i++){
            if(ktsc(a[i])) System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Nhap so phan tu cua mang: ");
            n=scanner.nextInt();
        } while (n<=1);
        int[] a=new int[n];
        Bai7 b7=new Bai7();
        System.out.println("Nhap gia tri cua mang:");
        b7.nhap(a);
        b7.xuat(a);
        System.out.print("\nCac phan tu la so nguyen to: ");
        b7.snt(a);
        System.out.print("\nCac phan tu la so hoan hao: ");
        b7.shh(a);
        System.out.print("\nCac phan tu la so chan: ");
        b7.sc(a);
    }
}
