/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;
import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
/*Nhập một mảng nguyên từ bàn phím
a) Sắp xếp và in lại dãy đã sắp ra màn hình.
b) In ra màn hình phần tử có giá trị nhỏ nhất
c) Tính trung bình cộng các phần tử chia hết cho 3.*/
public class Bai6 {
    //Ham nhap mang
    public void input(int a[], int n){
        System.out.println("Nhap gia tri cua mang:");
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=scanner.nextInt();
        }
    }
    //Ham xuat mang
    public void output(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    //Ham doi vi tri 2 phan tu
    public void swap(int arr[], int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    //Ham sap xep nhanh (quick sort) tang dan
    public int partitionInc(int arr[], int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
        while (true) {
            while (arr[++leftPointer] < pivot) {
                // khong lam gi
            }
            while (rightPointer > 0 && arr[--rightPointer] > pivot) {
                // khong lam gi
            }
            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(arr, leftPointer, rightPointer);
            }
        }
        swap(arr, leftPointer, right);
        return leftPointer;
    }
    public void quickSortInc(int arr[], int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partitionPoint = partitionInc(arr, left, right, pivot);
            quickSortInc(arr, left, partitionPoint - 1);
            quickSortInc(arr, partitionPoint + 1, right);
        }
    }
    //Ham sap xep nhanh (quick sort) giam dan
    public int partitionDec(int arr[], int left, int right, int pivot) {
        int leftPointer = left - 1;
        int rightPointer = right;
        while (true) {
            while (arr[++leftPointer] > pivot) {
                // khong lam gi
            }
            while (rightPointer > 0 && arr[--rightPointer] < pivot) {
                // khong lam gi
            }
            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(arr, leftPointer, rightPointer);
            }
        }
        swap(arr, leftPointer, right);
        return leftPointer;
    }
    public void quickSortDec(int arr[], int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partitionPoint = partitionDec(arr, left, right, pivot);
            quickSortDec(arr, left, partitionPoint - 1);
            quickSortDec(arr, partitionPoint + 1, right);
        }
    }
    //Ham tim phan tu nho nhat
    public int Min(int a[]){
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min) min=a[i];
        }
        return min;
    }
    //Ham tim phan tu lon nhat
    public int Max(int a[]){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max) max=a[i];
        }
        return max;
    }
    //ham tinh trung binh cong cac phan tu chia het cho 3
    public double TBC(int []a){
        float tbc=0;
        int dem=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%3==0) {
                tbc+=a[i];
                dem++;
            }
        }
        return (double)tbc/dem;
    }
    public static void main(String[] args) {
        int[]a;
        int n,chon;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Nhap so phan tu cua mang: ");
            n=scanner.nextInt();
        }while(n<=1);
        a=new int[n];
        Bai6 b6=new Bai6();
        b6.input(a, n);
        b6.output(a);
        while(true){
            System.out.println("\n==========MUC LUC==========");
            System.out.print("1.Nhap lai du lieu cho mang.\n2.Sap xep mang.\n3.In phan tu ra man hinh.\n4.Tinh trung binh cong cac phan tu chia het cho 3.\n5.Thoat\n");
            do{
                System.out.print("Moi ban nhap lua chon: ");
                chon=scanner.nextInt();
            }while(chon>5||chon<1);
            switch (chon) {
                case 1:
                    b6.input(a, n);
                    System.out.println("Mang sau khi nhap:");
                    b6.output(a);
                    break;
                case 2:
                    boolean c2=true;
                    int chon2;
                    while(c2){
                        System.out.println("\n==========MUC LUC==========");
                        System.out.println("1.Sap xep tang dan.\n2.Sap xep giam dan.\n3.Quay lai.");
                        do{
                            System.out.print("Moi ban nhap lua chon: ");
                            chon2=scanner.nextInt();
                        }while(chon2>3||chon2<1);
                        switch (chon2) {
                            case 1:
                                System.out.println("Mang truoc khi sap xep:");
                                b6.output(a);
                                System.out.println("Mang sau khi sap xep:");
                                b6.quickSortInc(a, 0, n-1);
                                b6.output(a);
                                break;
                            case 2:
                                System.out.println("Mang truoc khi sap xep:");
                                b6.output(a);
                                System.out.println("Mang sau khi sap xep:");
                                b6.quickSortDec(a, 0, n-1);
                                b6.output(a);
                                break;
                            default:
                                c2=false;
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean c3=true;
                    int chon3;
                    while(c3){
                        System.out.println("\n==========MUC LUC==========");
                        System.out.println("1.In phan tu nho nhat.\n2.In phan tu lon nhat.\n3.Quay lai.");
                        do{
                            System.out.print("Moi ban nhap lua chon: ");
                            chon3=scanner.nextInt();
                        }while(chon3>3||chon3<1);
                        switch (chon3) {
                            case 1:
                                System.out.println("Phan tu nho nhat la "+b6.Min(a));
                                break;
                            case 2:
                                System.out.println("Phan tu lon nhat la "+b6.Max(a));
                                break;
                            default:
                                c3=false;
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Trung binh cong cac phan tu chia het cho 3 la "+b6.TBC(a));
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
