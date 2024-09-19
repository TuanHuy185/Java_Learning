package Chapter1;

import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        int num1=285;
        int num2=125;
        int num3=185;
        int num4=325;
        int maxNumber=Math.max(Math.max(num1,num2),Math.max(num3,num4));
        System.out.println("Max: " + maxNumber);
    }
}
