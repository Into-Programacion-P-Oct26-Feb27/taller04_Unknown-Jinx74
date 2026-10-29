/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String titular;
        double cpu;
        double raton;
        double teclado;
        double pantalla;
        double total;
        double iva;
        double costofinal;
        
        
        
        
        System.out.println("Nombres del cliente:");
        titular = entrada.nextLine();
        System.out.println("CPU");
        cpu = entrada.nextDouble();
        System.out.println("Teclado:");
        teclado = entrada.nextDouble();
        System.out.println("Ratón:");
        raton = entrada.nextDouble();
        System.out.println("Pantalla:");
        pantalla = entrada.nextDouble();
        
        total = cpu+teclado+raton+pantalla;
        iva = 0.15*total;
        costofinal = total+iva;
        
        System.out.printf("Reporte:\n\n"
                + "Nombres del cliente:%s\n"
                + "Valores iniciales:\n\n"
                + "CPU:%.2f\n"
                + "Teclado%.2f\n"
                + "Ratón:%.2f\n"
                + "Pantalla:%.2f\n\n"
                + "Costo base:%.2f\n"
                + "Costo adicional del 15%%: %.2f\n"
                + "Costo final:%.2f\n", titular, cpu, teclado, raton, pantalla,
                total, iva, costofinal);
    }
    
}
