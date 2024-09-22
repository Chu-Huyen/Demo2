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
//Giải phương trình bậc 2ax^2 + bx + c = 0
public class Bai2 {
    public static void main(String[] args) {
        double a,b,c,d,x1,x2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=scanner.nextDouble();
        System.out.print("Nhap b: ");
        b=scanner.nextDouble();
        System.out.print("Nhap c: ");
        c=scanner.nextDouble();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem.");
                }
                else{
                    System.out.println("Phuong trinh vo nghiem.");
                }
            }
            else{
                System.out.println("Phuong trinh co nghiem x= "+(-c/b));
            }
        }
        else{
            d=b*b-4*a*c;
            if(d==0) System.out.println("Phuong trinh co nghiem x= "+-b/(2*a));
            else if(d>0){
                x1=(-b+Math.sqrt(d))/(2*a);
                x2=(-b-Math.sqrt(d))/(2*a);
                System.out.println("Phuong trinh co nghiem x1= "+x1+" va x2= "+x2);
            }
            else System.out.println("Phuong trinh vo nghiem.");
        }
    }
}
