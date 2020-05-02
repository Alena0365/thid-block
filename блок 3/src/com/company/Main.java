package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int inputInt (){
        Scanner in = new Scanner(System.in);
        int vvod = in.nextInt();
        return vvod;
    }
    public static double inputDouble (){
        Scanner in = new Scanner(System.in);
        double vvod = in.nextDouble();
        return vvod;
    }
    public static String inputStr (){
        Scanner in = new Scanner(System.in);
        String vvod = in.nextLine();
        return vvod;
    }
    public static char inputchar () throws IOException {
        Scanner in = new Scanner(System.in);
        char vvod=(char)System.in.read();
        return vvod;
    }
    public static int task1(int a, int b, int c){
        double D=Math.pow(b,2)-4*a*c;
        int k=0;
        if(D==0){k=1;}
        else if(D>0){k=2;}
        else {k=0;}
        return k;
    }
    public static int task2(String str){
         int count = 0;
        int index = 0;
        for(int i = 0; i<str.length()-2;i++){
            if ((str.charAt(i) == 'z') && (str.charAt(i+1) == 'i') && (str.charAt(i+2) == 'p')){
                count++;
            }
            if (count == 2){
                index = i;
                break;
            }
        }
        if (index == 0){
            return -1;
        }
        else{
            return index;
        }
    }
    public static boolean task3(int a){
        int summa = 0;
        for (int i = 1; i < a; i++){
            if (a % i == 0){
                summa += i;
            }
        }
        return summa == a;
    }
    public static String task4(String str){
        if (str.length()<2) {
            return "Несовместимо";
        }
        if (str.charAt(0) == str.charAt(str.length()-1)){
            return "Два-это пара";
        }
        else{
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            return last + str.substring(1,str.length()-1) + first;
        }
    }
    public static boolean task5(String str) {
        if ((str.length() == 7) && (str.charAt(0) == '#')) {
            for (int i = 1; i < str.length(); i++) {
                if (((int) str.charAt(i) > 47) && ((int) str.charAt(i) < 58) || ((int) str.charAt(i) > 64) && ((int) str.charAt(i) < 71) || ((int) str.charAt(i) > 96) && ((int) str.charAt(i) < 103)) {

                }
                else{return false;}
            }
            return true;
        }
        else{return false;}
    }

    public static boolean task6(int[] str1, int[] str2 ){
        int unique1=0, unique2=0, count1=0, count2=0, res1, res2;
        for (int i=0;i<str1.length;i++){
            unique1++;
            for(int j=i+1;j<str1.length;j++){
                if(str1[j]==str1[i]){
                    count1++;
                    break;
                }
            }
        }
        res1=unique1-count1;
        for (int f=0;f<str2.length;f++){
            unique2++;
            for(int h=f+1;h<str2.length;h++){
                if(str2[h]==str2[f]){
                    count2++;
                    break;
                }
            }
        }
        res2=unique2-count2;
        return res1==res2;
    }

    public static boolean task7(int n){
        int square =n*n;
        int half = 0;
        String str = "";
        str += square;

        if (str.length() % 2 == 0){
            half = str.length() / 2;
        }else{
            half = ((str.length()) / 2)+1;
        }

        int left = 0, right = 0;
        left = (int)(square / Math.pow(10,half));
        right = (int)(square % Math.pow(10,half));
        return left + right==n;
    }

    public static int task8(String str){
        
    }

    public static void main(String[] args) {

        int key=0;
        do{
            System.out.println("Введите номер задания:");
            key=inputInt();
            switch (key){
                case (1):
                    System.out.println("Введите коэффициент a: ");
                    int a=inputInt();
                    System.out.println("Введите коэффициент b: ");
                    int b=inputInt();
                    System.out.println("Введите коэффициент c: ");
                    int c=inputInt();
                    System.out.println("Результат:" + task1(a,b,c));
                    break;
                case(2):
                    System.out.println("Введите строку: ");
                    String str=inputStr();
                    System.out.println("Результат: " + task2(str));
                    break;
                case(3):
                    System.out.println("Введите число: ");
                    int d=inputInt();
                    System.out.println("Результат: " + task3(d));
                    break;
                case(4):
                    System.out.println("Введите строку: ");
                    String str1=inputStr();
                    System.out.println("Результат: " + task4(str1));
                    break;
                case (5):
                    System.out.println("Введите строку: ");
                    String str2=inputStr();
                    System.out.println("Результат: " + task5(str2));
                    break;
                case(6):
                    System.out.println("Введите длину первого массива: ");
                    int [] str3= new int[inputInt()];
                    System.out.println("Введите первый массив: ");
                    for (int i=0;i<str3.length;i++){
                        str3[i]=inputInt();
                    }
                    System.out.println("Введите длину второго массива: ");
                    int [] str4= new int[inputInt()];
                    System.out.println("Введите второй массив: ");
                    for (int i=0;i<str4.length;i++){
                        str4[i]=inputInt();
                    }
                    System.out.println("Результат: " + task6(str3,str4));
                    break;
                case(7):
                    System.out.println("Введите число: ");
                    int n=inputInt();
                    System.out.println("Результат: " + task7(n));
                    break;
                case(8):

                    break;
                case(9):

                    break;
                case(10):

                    break;
                case(11):

                    break;
            }
        } while (key!=11);

       /* System.out.println("Введите коэффициент a: ");
        int a=inputInt();
        System.out.println("Введите коэффициент b: ");
        int b=inputInt();
        System.out.println("Введите коэффициент c: ");
        int c=inputInt();
        System.out.println("Результат:" + task1(a,b,c));
        System.out.println("Введите строку: ");
        String str=inputStr();
        System.out.println("Результат: " + task2(str));
        System.out.println("Введите число: ");
        int d=inputInt();
        System.out.println("Результат: " + task3(d));
        System.out.println("Введите строку: ");
        String str1=inputStr();
        System.out.println("Результат: " + task4(str1));
        System.out.println("Введите строку: ");
        String str2=inputStr();
        System.out.println("Результат: " + task5(str2));
        System.out.println("Введите длину первого массива: ");
        int [] str3= new int[inputInt()];
        System.out.println("Введите первый массив: ");
        for (int i=0;i<str3.length;i++){
            str3[i]=inputInt();
        }
        System.out.println("Введите длину второго массива: ");
        int [] str4= new int[inputInt()];
        System.out.println("Введите второй массив: ");
        for (int i=0;i<str4.length;i++){
            str4[i]=inputInt();
        }
        System.out.println("Результат: " + task6(str3,str4));*/


    }
}
