/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

import com.sun.corba.se.impl.oa.poa.AOMEntry;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
//Nhập n phần tử. Xóa phần tử có giá trị bằng x
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,x;int add=-1;
        do {
            System.out.print("Enter the number of elements in the array ");
            n=scanner.nextInt();
        } while (n<=1);
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter an integer: ");
            a[i]=scanner.nextInt();
        }
        System.out.println("Array before being deleted: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nEnter an integer: ");
        x=scanner.nextInt();
        int check=n;
        while(true){
            for(int i=0;i<n;i++){
            if(a[i]==x){
                add=i;
                n--;
                break;
                }
            }
            if(add==-1){
                break;
            }
            else {
                for(int i=add;i<n;i++){
                    a[i]=a[i+1];
            }
                add=-1;
            }
        }
        if(check==n){
                System.out.println("Elements does not exist.");
        }
        else{
        System.out.println("Array after being deleted: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
            }
        }
    }
}
