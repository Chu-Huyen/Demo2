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
/*Viết chương trình tìm điểm trung bình của 2 học sinh trong 3 môn học.
Cho điểm của học sinh thứ nhất là 60, 55 và 70, điểm của học sinh thứ 2 là 80, 60, 41*/
/*Viết chương trình nhập điểm cho n học sinh trong m môn học.
Tính điểm trung bình cho mỗi học sinh*/
public class Bai10 {
    public void nhap(int [][] a,int n, int m){
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.println("Nhap diem cho hoc sinh thu "+(i+1)+": ");
            for(int j=0;j<m;j++){
                System.out.print("Mon "+(j+1)+": ");
                a[i][j]=scanner.nextInt();
            }
        }
    }
    public void xuat(int [][]a,int n,int m){
        int []b=new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i]+=a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("\nDiem cua hoc sinh thu "+(i+1)+": ");
            for(int j=0;j<m;j++){
                System.out.print("\nMon "+(j+1)+": "+a[i][j]);
            }
            System.out.print("\nDiem trung binh: "+diemtb(b[i],m));
        }
    }
    public float diemtb(int a,int n){
        return (float)a/n;
    }
    public static void main(String[] args) {
        /*int [][] diem={
            {60,55,70},
            {80,60,41}
        };
        int []tb= new int[2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                tb[i]+=diem[i][j];
            }
        }
        System.out.println("Diem cua hoc sinh 1: "+(float)tb[0]/3);
        System.out.println("Diem cua hoc sinh 2: "+(float)tb[1]/3);*/
        int n,m;
        Bai10 b10=new Bai10();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.print("Nhap so hoc sinh: ");
            n=scanner.nextInt();
        } while (n<=0);
        do {
            System.out.print("Nhap so mon: ");
            m=scanner.nextInt();
        } while (m<=0);
        int[][]a=new int[n][m];
        b10.nhap(a, n, m);
        b10.xuat(a, n, m);
    }
}
