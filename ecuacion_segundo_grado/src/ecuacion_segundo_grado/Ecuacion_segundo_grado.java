/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacion_segundo_grado;

import java.util.Scanner;

/**
 *
 * @author Rafae
 */
public class Ecuacion_segundo_grado {

    /**
     * @param args the command line arguments
     */
    public static double[] segundo_grado(double a, double b, double c){
        
        double res_pos,res_neg;
        res_pos=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        res_neg=(-b-Math.sqrt((b*b)-4*a*c))/(2*a);
        double [] resultados={res_pos,res_neg};
        
    return resultados;
    }
    
    public static void recorrer_array(double[]array){
    System.out.println("Mostrando array...");
            for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
            System.out.println("\n");
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        double a=0,b,c;
        double[] soluciones;
        
        while(a==0){
        System.out.println("Que multiplica a x cuadrado? debe ser distinto de 0");
        a=scan.nextDouble();
        }
        System.out.println("Que multiplica a x? ");
        b=scan.nextDouble();
        
        System.out.println("Que va solo? ");
        c=scan.nextDouble();
        
        soluciones=segundo_grado(a,b,c);
        
        recorrer_array(soluciones);
    }
    
}
