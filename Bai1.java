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
//Tìm max, min của 2 số nguyên nhập từ bàn phím
public class Bai1 {
    public static void main(String[] args) {
        int min, max;
        int a, b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number a: ");
        a=s.nextInt();
        System.out.print("Enter number b: ");
        b=s.nextInt();
        max=a>b?a:b;
        min=a>b?b:a;
        System.out.println("Min: "+min+"\nMax: "+max);
    }
}
