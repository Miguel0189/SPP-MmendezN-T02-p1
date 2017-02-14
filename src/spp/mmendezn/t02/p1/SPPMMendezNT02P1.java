/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mmendezn.t02.p1;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class SPPMMendezNT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //introducimos las variables:
        
        double sue, he, st;
        int cate;
        Scanner kb =new Scanner(System.in);
        
        System.out.println("Introduce (del 1-8) la categoria del trabador");
        
        cate=kb.nextInt();
        
        if (cate>=1 && cate<=8){
        switch (cate){
            case 1:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 30);
                System.out.println("El sueldo total es de: "+st);
                break;
            case 2:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 38);
                System.out.println("El sueldo total es de: "+st);
                break;
            case 3:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 50);
                System.out.println("El sueldo total es de: "+st);
                break;
            case 4:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 70);
                System.out.println("El sueldo total es de: "+st);
                break;
            case 5:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 90);
                System.out.println("El sueldo total es de: "+st);
                break;
            case 6:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 110);
                System.out.println("El sueldo total es de: "+st);
                break;
            case 7:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 130);
                System.out.println("El sueldo total es de: "+st);
                break;
            case 8:
                he= mphorasExtra();
                sue= mpsueldo();
                st=sue+(he * 150);
                System.out.println("El sueldo total es de: "+st);
                break;
            default:
                break;
            }
            }
        else {
            System.out.println("este valor no esta admitido, debe ser de 1-8");
                }
        }
    
    static double mphorasExtra() {
        
        Scanner kb= new Scanner(System.in);
        double he;
            System.out.println("Introduzca el numero de horas extra");
            he=kb.nextDouble();
            return he;
    }
    static double mpsueldo() {
        
        double sue;
        Scanner kb= new Scanner(System.in);
            System.out.println("Introduzca el sueldo inicial");
            sue=kb.nextDouble();
        return sue;
      
    }
    
}
