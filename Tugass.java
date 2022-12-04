/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugass;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tugass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
     int jenis_kelamin, hasil;
     float berat, tinggi, bmi, meter;
     double broca;
     
        System.out.println("MENGHITUNG BERAT BADAN");
        System.out.println("");
        System.out.println("Jenis Kelamin: ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
        System.out.println("");
        System.out.print("Masukkan jenis kelamin: ");
        jenis_kelamin=input.nextInt();
        System.out.print("Masukkan berat badan: ");
        berat=input.nextFloat();
        System.out.print("Masukkan tinggi badan (contoh: 1.50): ");
        tinggi=input.nextFloat();
        meter=tinggi / 100;
        
        bmi=(berat/(meter*meter));
        System.out.println("BMI: " + bmi + " ");
        
        if (bmi>=30){
            System.out.println("kurus");
        }else if (bmi>=40){
            System.out.println("normal");
        }else if (bmi>=50){
            System.out.println("overweight");
        }else {
            System.out.println("obesitas");
    }
    
}
}
