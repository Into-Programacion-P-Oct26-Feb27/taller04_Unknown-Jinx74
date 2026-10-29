/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gastoMensual;
                
        System.out.println("Ingrese el nombre del primer proyecto");
        proyecto1 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        gasto1 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del segundo proyecto");
        proyecto2 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        gasto2 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del tercer proyecto");
        proyecto3 = entrada.nextLine();
        System.out.println("Ingrese el gasto mensual");
        gasto3 = entrada.nextDouble();
        
        gastoMensual = gasto1 + gasto2 + gasto3;
        
        System.out.printf("CONTROL DE GASTOS DE PROYECTOS\n"
                + "Proyectos:\n ----------------------"
                + "\n1. %s:%.2f\n2. %s: %.2f\n"
                + "3. %s: %.2f\nGasto mensual: %.2f",
                proyecto1,gasto1, proyecto2,gasto2,
                proyecto3,gasto3, gastoMensual);
       }
    
}
