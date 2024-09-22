/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
/*Viết chương trình java cho phép tạo và thực hiện theo menu sau:
1. Nhập vào một số nguyên dương n.
2. Tính tổng các số từ 1 đến n
3. Kiểm tra n có là số nguyên tố
4. Kiểm tra n có là số hoàn hảo.
5. Hiển thị số n thành tích các thừa số nguyên tố.
6. Thoát
(Hiển thị 1 số nguyên dương thành tích các thừa số nguyên tố: n = 24 in ra: n = 2^3x3)*/
public class Bai3 {
    public static int tong(int n){
        int tong=0;
        for(int i=1;i<=n;i++) tong+=i;
        return tong;
    }
    public static boolean snt(int n){
        if(n!=2&&n%2==0) return false;
        else if(n==3) return true;
        else{
            for (int i = 3; i <=n/2; i++) {
                if(n%i==0) return false;
            }
        }
        return true;
    }
    public static boolean shh(int n){
        int tong=0;
        for (int i = 1; i <=n/2; i++) {
            if(n%i==0) tong+=i;
        }
        if(tong==n) return true; else return false;
    }
    public static List<Integer> phantich(int n){
        int i=2;
        List<Integer> a=new ArrayList<Integer>();
        while(n>1){
            if(n%i==0){
                n/=i;
                a.add(i);
            }
            else i++;
        }
        if(a.isEmpty()){
            a.add(n);
        }
        return a;
    }
    public static void main(String[] args) {
        int n;
        int chon;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Nhap mot so nguyen duong khac 1: ");
            n=scanner.nextInt();
        }while(n<=1);
        while(true){
            System.out.println("===========Menu===========");
            System.out.print("1.Nhap so\n2.Tinh tong\n3.Kiem tra so nguyen to\n"
                    + "4.Kiem tra so hoan hao\n5.Phan tich thua so nguyen to\n6.Thoat\n");
            System.out.println("Moi nhap lua chon: ");
            chon=scanner.nextInt();
            switch (chon) {
                case 1:
                    do{
                        System.out.print("Nhap mot so nguyen duong khac 1: ");
                        n=scanner.nextInt();
                    }while(n<=1);
                    break;
                case 2:
                    System.out.println("Tong cac so tu 1 den "+n+" la "+tong(n));
                    break;
                case 3:
                    if(snt(n)) System.out.println(n+" la so nguyen to");
                    else System.out.println(n+" khong la so nguyen to");
                    break;
                case 4:
                    if(shh(n)) System.out.println(n+ " la so hoan hao");
                    else System.out.println(n+ " khong la so hoan hao");
                    break;
                case 5:
                    int x=n;
                    List<Integer> listNumbers = phantich(x);
                    System.out.printf("Ket qua: %d = ", n);
                    int size = listNumbers.size();
                    for (int i = 0; i < size - 1; i++) {
                        System.out.print(listNumbers.get(i) + " x ");
                    }
                    System.out.println(listNumbers.get(size - 1));
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
