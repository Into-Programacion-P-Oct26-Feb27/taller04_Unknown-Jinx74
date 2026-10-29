/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String titular;
        String address;
        double costo;
        int minutos;
        double total;
        
        System.out.println("Titular:");
        titular = entrada.nextLine();
        System.out.println("Direccion:");
        address = entrada.nextLine();
        System.out.println("Costo por minuto:");
        costo = entrada.nextDouble();
        System.out.println("Minutos totales:");
        minutos = entrada.nextInt();
        total = costo*minutos;
        
        System.out.printf("PLANILLA DE SERVICIO TELEFONICO\n\n"
                + "Titurlar: %s\n"
                + "Dirección: %s\n"
                + "Costo por minuto:%s\n"
                + "Total de minutos:%s\n"
                + "Costo total:$%s\n", titular, address, costo, minutos, total);
        
    }
    
}
