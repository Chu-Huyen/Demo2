/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.baitap;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Bai4 {
//Tìm UCLN BCNN của 2 số đc nhập từ bàn phím
    public static int UCLN(int a, int b){
        int x,y;
        x=a;y=b;
        while(x!=y){
            if(x>y) x-=y;
            else y-=x;
        }
        return x;
    }
    public static int BCNN(int a, int b){
        return (a*b)/UCLN(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        do{
            System.out.print("Input number a: ");
            a=scanner.nextInt();
            System.out.print("Input number b: ");
            b=scanner.nextInt();
        }while(a<=0||b<=0);
        System.out.println("The greatest common divisor of "+a+" and "+b+" is "+UCLN(a,b));
        System.out.println("The least common multiple of "+a+" and "+b+" is "+BCNN(a,b));
}
}
