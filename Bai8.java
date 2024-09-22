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
/*Nhập mảng có n phần tử các số nguyên,
sắp xếp mảng tăng dần bằng thuật toán chèn
và hiển thị mảng đã sắp xếp ra màn hình*/
public class Bai8 {
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
    //Hàm sắp xếp chèn tăng dần
    public void InsertionSortInc(int[]a,int n){
        int valueToInsert;
        int holePosition;
        int i;
        // lap qua tat ca cac so
        for (i = 1; i < n; i++) {
 
            // chon mot gia tri de chen
            valueToInsert = a[i];
 
            // lua chon vi tri de chen
            holePosition = i;
 
            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (holePosition > 0 && a[holePosition - 1] > valueToInsert) {
                a[holePosition]=a[holePosition-1];
                holePosition--;
            }
            if (holePosition != i) {
                // chen phan tu tai vi tri chen
                a[holePosition]=valueToInsert;
            }
        }
    }

//Hàm sắp xếp chèn giảm dần
    public void InsertionSortDec(int[]a,int n){
        int valueToInsert;
        int holePosition;
        int i;
        // lap qua tat ca cac so
        for (i = 1; i < n; i++) {
 
            // chon mot gia tri de chen
            valueToInsert = a[i];
 
            // lua chon vi tri de chen
            holePosition = i;
 
            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (holePosition > 0 && a[holePosition - 1] < valueToInsert) {
                a[holePosition]=a[holePosition-1];
                holePosition--;
            }
            if (holePosition != i) {
                // chen phan tu tai vi tri chen
                a[holePosition]=valueToInsert;
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Nhap so phan tu cua mang: ");
            n=scanner.nextInt();
        }while(n<=1);
        int []a=new int[n];
        Bai8 b8=new Bai8();
        b8.nhap(a);
        System.out.println("Mang truoc khi sap xep:");
        b8.xuat(a);
        b8.InsertionSortInc(a, n);
        System.out.println("\nMang sap xep tang dan:");
        b8.xuat(a);
        b8.InsertionSortDec(a, n);
        System.out.println("\nMang sap xep giam dan:");
        b8.xuat(a);
    }
}
